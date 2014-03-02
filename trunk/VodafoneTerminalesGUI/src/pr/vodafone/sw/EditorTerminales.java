

/**
 * EditorTerminales.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package pr.vodafone.sw;

    /*
     *  EditorTerminales java interface
     */

    public interface EditorTerminales {
          

        /**
          * Auto generated method signature
          * 
                    * @param obtenerTerminalesPorMarca1
                
         */

         
                     public pr.vodafone.sw.ObtenerTerminalesPorMarcaResponse obtenerTerminalesPorMarca(

                        pr.vodafone.sw.ObtenerTerminalesPorMarca obtenerTerminalesPorMarca1)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerTerminalesPorMarca1
            
          */
        public void startobtenerTerminalesPorMarca(

            pr.vodafone.sw.ObtenerTerminalesPorMarca obtenerTerminalesPorMarca1,

            final pr.vodafone.sw.EditorTerminalesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param obtenerTerminales3
                
         */

         
                     public pr.vodafone.sw.ObtenerTerminalesResponse obtenerTerminales(

                        pr.vodafone.sw.ObtenerTerminales obtenerTerminales3)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerTerminales3
            
          */
        public void startobtenerTerminales(

            pr.vodafone.sw.ObtenerTerminales obtenerTerminales3,

            final pr.vodafone.sw.EditorTerminalesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param insertarTerminal5
                
         */

         
                     public pr.vodafone.sw.InsertarTerminalResponse insertarTerminal(

                        pr.vodafone.sw.InsertarTerminal insertarTerminal5)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param insertarTerminal5
            
          */
        public void startinsertarTerminal(

            pr.vodafone.sw.InsertarTerminal insertarTerminal5,

            final pr.vodafone.sw.EditorTerminalesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param borrarTerminal7
                
         */

         
                     public pr.vodafone.sw.BorrarTerminalResponse borrarTerminal(

                        pr.vodafone.sw.BorrarTerminal borrarTerminal7)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param borrarTerminal7
            
          */
        public void startborrarTerminal(

            pr.vodafone.sw.BorrarTerminal borrarTerminal7,

            final pr.vodafone.sw.EditorTerminalesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param actualizarTerminal9
                
         */

         
                     public pr.vodafone.sw.ActualizarTerminalResponse actualizarTerminal(

                        pr.vodafone.sw.ActualizarTerminal actualizarTerminal9)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param actualizarTerminal9
            
          */
        public void startactualizarTerminal(

            pr.vodafone.sw.ActualizarTerminal actualizarTerminal9,

            final pr.vodafone.sw.EditorTerminalesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param obtenerTerminal11
                
         */

         
                     public pr.vodafone.sw.ObtenerTerminalResponse obtenerTerminal(

                        pr.vodafone.sw.ObtenerTerminal obtenerTerminal11)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param obtenerTerminal11
            
          */
        public void startobtenerTerminal(

            pr.vodafone.sw.ObtenerTerminal obtenerTerminal11,

            final pr.vodafone.sw.EditorTerminalesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param main13
                
             * @throws pr.vodafone.sw.EditorTerminalesSQLExceptionException : 
             * @throws pr.vodafone.sw.EditorTerminalesClassNotFoundExceptionException : 
         */

         
                     public void main(

                        pr.vodafone.sw.Main main13)
                        throws java.rmi.RemoteException
             
          ,pr.vodafone.sw.EditorTerminalesSQLExceptionException
          ,pr.vodafone.sw.EditorTerminalesClassNotFoundExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param main13
            
          */
        public void startmain(

            pr.vodafone.sw.Main main13,

            final pr.vodafone.sw.EditorTerminalesCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    