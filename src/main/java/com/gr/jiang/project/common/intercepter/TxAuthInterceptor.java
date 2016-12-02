package com.gr.jiang.project.common.intercepter;

import com.gr.jiang.project.bo.TxIfBo;
import com.gr.jiang.project.common.context.FinHttpRequestInfo;
import com.gr.jiang.project.dto.BaseResponseDto;
import com.gr.jiang.project.logger.FinBoLog;
import com.gr.jiang.project.logger.FinITFLog;
import com.gr.jiang.project.po.impl.TxIfPo;
import com.gr.jiang.project.util.DateUtil;
import com.gr.jiang.project.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by jiang on 2016/10/23.
 */
public class TxAuthInterceptor implements HandlerInterceptor{
    @Autowired
    private TxIfBo txIfBo ;
    /**
     * Intercept the execution of a handler. Called after HandlerMapping determined
     * an appropriate handler object, but before HandlerAdapter invokes the handler.
     * <p>DispatcherServlet processes a handler in an execution chain, consisting
     * of any number of interceptors, with the handler itself at the end.
     * With this method, each interceptor can decide to abort the execution chain,
     * typically sending a HTTP error or writing a custom response.
     *
     * @param request  current HTTP request
     * @param response current HTTP response
     * @param handler  chosen handler to execute, for type and/or instance evaluation
     * @return {@code true} if the execution chain should proceed with the
     * next interceptor or the handler itself. Else, DispatcherServlet assumes
     * that this interceptor has already dealt with the response itself.
     * @throws Exception in case of errors
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        FinHttpRequestInfo finHttpRequestInfo = initUrl(request);
        FinITFLog.info(finHttpRequestInfo.toString());
        if(!isAccess(finHttpRequestInfo)) {
//            response.sendRedirect("/");
            writeResponse(response);
            return false;
        }
        return true;
    }

    /**
     * Intercept the execution of a handler. Called after HandlerAdapter actually
     * invoked the handler, but before the DispatcherServlet renders the view.
     * Can expose additional model objects to the view via the given ModelAndView.
     * <p>DispatcherServlet processes a handler in an execution chain, consisting
     * of any number of interceptors, with the handler itself at the end.
     * With this method, each interceptor can post-process an execution,
     * getting applied in inverse order of the execution chain.
     *
     * @param request      current HTTP request
     * @param response     current HTTP response
     * @param handler      handler (or {@link HandlerMethod}) that started async
     *                     execution, for type and/or instance examination
     * @param modelAndView the {@code ModelAndView} that the handler returned
     *                     (can also be {@code null})
     * @throws Exception in case of errors
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    /**
     * Callback after completion of request processing, that is, after rendering
     * the view. Will be called on any outcome of handler execution, thus allows
     * for proper resource cleanup.
     * <p>Note: Will only be called if this interceptor's {@code preHandle}
     * method has successfully completed and returned {@code true}!
     * <p>As with the {@code postHandle} method, the method will be invoked on each
     * interceptor in the chain in reverse order, so the first interceptor will be
     * the last to be invoked.
     *
     * @param request  current HTTP request
     * @param response current HTTP response
     * @param handler  handler (or {@link HandlerMethod}) that started async
     *                 execution, for type and/or instance examination
     * @param ex       exception thrown on handler execution, if any
     * @throws Exception in case of errors
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        HandlerMethod handlerMethod = (HandlerMethod)handler;
        FinITFLog.info(handlerMethod.getMethod().getReturnType()+"");
        FinITFLog.info(handlerMethod.getMethod().getReturnType().getSuperclass()+"");
        if(handlerMethod.getMethod().getReturnType().getSuperclass() == BaseResponseDto.class) {
            FinITFLog.info("BaseResponseDto=true");
            handlerMethod.getMethodParameters()[0].getMethod();
            FinITFLog.info(response.toString());
//            response.getWriter()
            FinITFLog.info(handlerMethod.getMethod().getDefaultValue()+"");
//            FinITFLog.info(handlerMethod.getMethod());
        }
    }
    private FinHttpRequestInfo initUrl(HttpServletRequest request){
        String url = request.getRequestURI();
        if(null == url || "".equals(url))
            return null ;
        FinBoLog.info(url);
        TxIfPo txIfPo = txIfBo.query(url);
        if(null == txIfPo)
            return null ;
        FinHttpRequestInfo finHttpRequestInfo = new FinHttpRequestInfo();
        finHttpRequestInfo.setAppId(txIfPo.getAppId());
        finHttpRequestInfo.setModId(txIfPo.getModId());
        finHttpRequestInfo.setDesc(txIfPo.getDesc());
        finHttpRequestInfo.setLogFlg(txIfPo.getLogFlg());
        finHttpRequestInfo.setPwdFlg(txIfPo.getPwdFlg());
        finHttpRequestInfo.setTxFlg(txIfPo.getTxFlg());
        finHttpRequestInfo.setUrl(url);
        finHttpRequestInfo.setSip(request.getRemoteAddr());
        finHttpRequestInfo.setSesId(request.getRequestedSessionId());
        finHttpRequestInfo.setTmSmp(DateUtil.getCurrentDate(DateUtil.DATE_YYYY_MM_DD_HH_mm_ss_SS));
        return finHttpRequestInfo;
    }
    private boolean isAccess(FinHttpRequestInfo finHttpRequestInfo){
        if(null == finHttpRequestInfo)
            return false ;
        return "Y".equalsIgnoreCase(StringUtil.trimToNull(finHttpRequestInfo.getTxFlg())) ;
    }
    private void writeResponse(HttpServletResponse response) {
        PrintWriter w = null;
        try {
            response.setCharacterEncoding("GB2312");
            w = response.getWriter();
            w.write("{\"rspCd\":\""
                    + "9999"
                    + "\",\"rspInf\":\"接口不存在\",\"responseTm\":\""
                    + System.currentTimeMillis()
                    + "\"}");
        } catch (IOException e) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
        } finally {
            if (null != w) {
                w.flush();
                w.close();
            }
        }
    }
}
