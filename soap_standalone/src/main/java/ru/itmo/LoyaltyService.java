package ru.itmo;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;
import com.sun.xml.ws.fault.SOAPFaultBuilder;
import java.util.ArrayList;
import javax.jws.WebParam;

@WebService(serviceName = "LoyaltyService")
public class LoyaltyService {
    SOAPFaultBuilder soapFaultBuilder;

        public LoyaltyService(){
            soapFaultBuilder.captureStackTrace = false;
        }

    @WebMethod(operationName = "getAll")
    public List<Loyalty> getAll() {
        PostgreSQLDAO dao = new PostgreSQLDAO();
        return dao.getAll();
    }
    
     @WebMethod(operationName = "createLoyalty")
    public String createLoyalty(@WebParam(name = "spbsoID") int spbsoID,
                                       @WebParam(name = "fullName") String name,
                                       @WebParam(name = "event") String event,
                                       @WebParam(name = "cash") int cash,
                                       @WebParam(name = "brigade") String brigade) {
        PostgreSQLDAO dao = new PostgreSQLDAO();
        return dao.createLoyalty(spbsoID, name, brigade, event, cash);
    }

    @WebMethod(operationName = "deleteLoyalty")
    public String deleteLoyalty(@WebParam(name = "rowId") int rowId) {
        PostgreSQLDAO dao = new PostgreSQLDAO();
        return dao.deleteLoyalty(rowId);
    }
    
    @WebMethod(operationName = "updateLoyalty")
    public String updateLoyalty(@WebParam(name = "rowId") int rowId,
                                @WebParam(name = "spbsoID") int spbsoID,
                                       @WebParam(name = "fullName") String name,
                                       @WebParam(name = "event") String event,
                                       @WebParam(name = "cash") int cash,
                                       @WebParam(name = "brigade") String brigade) {

        List<String> updateArgs = new ArrayList<>();

        if (name != null && !name.trim().isEmpty()) updateArgs.add("name = '" + name + "'");
        if (event != null && !event.trim().isEmpty()) updateArgs.add("event = '" + event + "'");
        if (spbsoID != 0) updateArgs.add("spbso = '" + spbsoID + "'");
        if (cash != 0) updateArgs.add("cash = '" + cash + "'");
        if (brigade != null && !brigade.trim().isEmpty()) updateArgs.add("brigade = '" + brigade + "'");


        PostgreSQLDAO dao = new PostgreSQLDAO();
        return dao.updateStudent(rowId, updateArgs);
    }

}
