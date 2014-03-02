
/**
 * EditorTerminalesSQLExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

package pr.vodafone.sw;

public class EditorTerminalesSQLExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1393780088735L;
    
    private pr.vodafone.sw.EditorTerminalesSQLException faultMessage;

    
        public EditorTerminalesSQLExceptionException() {
            super("EditorTerminalesSQLExceptionException");
        }

        public EditorTerminalesSQLExceptionException(java.lang.String s) {
           super(s);
        }

        public EditorTerminalesSQLExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public EditorTerminalesSQLExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(pr.vodafone.sw.EditorTerminalesSQLException msg){
       faultMessage = msg;
    }
    
    public pr.vodafone.sw.EditorTerminalesSQLException getFaultMessage(){
       return faultMessage;
    }
}
    