
/**
 * EditorTerminalesCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package pr.vodafone.sw;

    /**
     *  EditorTerminalesCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class EditorTerminalesCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public EditorTerminalesCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public EditorTerminalesCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for obtenerTerminalesPorMarca method
            * override this method for handling normal response from obtenerTerminalesPorMarca operation
            */
           public void receiveResultobtenerTerminalesPorMarca(
                    pr.vodafone.sw.ObtenerTerminalesPorMarcaResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerTerminalesPorMarca operation
           */
            public void receiveErrorobtenerTerminalesPorMarca(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerTerminales method
            * override this method for handling normal response from obtenerTerminales operation
            */
           public void receiveResultobtenerTerminales(
                    pr.vodafone.sw.ObtenerTerminalesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerTerminales operation
           */
            public void receiveErrorobtenerTerminales(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for insertarTerminal method
            * override this method for handling normal response from insertarTerminal operation
            */
           public void receiveResultinsertarTerminal(
                    pr.vodafone.sw.InsertarTerminalResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from insertarTerminal operation
           */
            public void receiveErrorinsertarTerminal(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for borrarTerminal method
            * override this method for handling normal response from borrarTerminal operation
            */
           public void receiveResultborrarTerminal(
                    pr.vodafone.sw.BorrarTerminalResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from borrarTerminal operation
           */
            public void receiveErrorborrarTerminal(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for actualizarTerminal method
            * override this method for handling normal response from actualizarTerminal operation
            */
           public void receiveResultactualizarTerminal(
                    pr.vodafone.sw.ActualizarTerminalResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from actualizarTerminal operation
           */
            public void receiveErroractualizarTerminal(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for obtenerTerminal method
            * override this method for handling normal response from obtenerTerminal operation
            */
           public void receiveResultobtenerTerminal(
                    pr.vodafone.sw.ObtenerTerminalResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from obtenerTerminal operation
           */
            public void receiveErrorobtenerTerminal(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for main method
            * override this method for handling normal response from main operation
            */
           public void receiveResultmain(
                    ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from main operation
           */
            public void receiveErrormain(java.lang.Exception e) {
            }
                


    }
    