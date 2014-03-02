
/**
 * EditorTerminalesClassNotFoundExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package pr.vodafone.sw;

public class EditorTerminalesClassNotFoundExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1393780088764L;
    
    private pr.vodafone.sw.EditorTerminalesClassNotFoundException faultMessage;

    
        public EditorTerminalesClassNotFoundExceptionException() {
            super("EditorTerminalesClassNotFoundExceptionException");
        }

        public EditorTerminalesClassNotFoundExceptionException(java.lang.String s) {
           super(s);
        }

        public EditorTerminalesClassNotFoundExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public EditorTerminalesClassNotFoundExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(pr.vodafone.sw.EditorTerminalesClassNotFoundException msg){
       faultMessage = msg;
    }
    
    public pr.vodafone.sw.EditorTerminalesClassNotFoundException getFaultMessage(){
       return faultMessage;
    }
}
    