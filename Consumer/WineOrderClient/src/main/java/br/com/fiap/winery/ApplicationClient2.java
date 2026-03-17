package br.com.fiap.winery;

import jakarta.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import stubclasses.WineStockServiceImplementation;
import stubclasses.WineWarningServiceImplementation;

public class ApplicationClient2 {
    public static void main(String[] args) throws MalformedURLException {
        String WSDL = "http://localhost:8085/WineStockService?wsdl";
        String WSDL2 = "http://localhost:8085/wineWarning?wsdl";
        String TARGET = "http://winery.fiap.com.br/";
        String NAME = "WineStockServiceImplementationService";
        String NAME2 = "WineWarningServiceImplementationService";
        URL url = new URL("http://localhost:8085/WineStockService?wsdl");
        URL url2 = new URL("http://localhost:8085/wineWarning?wsdl");
        QName qName = new QName("http://winery.fiap.com.br/", "WineStockServiceImplementationService");
        QName qName2 = new QName("http://winery.fiap.com.br/", "WineWarningServiceImplementationService");
        Service service = Service.create(url, qName);
        Service service2 = Service.create(url2, qName2);
        WineStockServiceImplementation wineStockService = (WineStockServiceImplementation)service.getPort(WineStockServiceImplementation.class);
        String order = wineStockService.placeOrder("Teste", 50);
        System.out.println(order);
        WineWarningServiceImplementation wineWarningService = (WineWarningServiceImplementation)service2.getPort(WineWarningServiceImplementation.class);
        String warn = wineWarningService.sendWarn();
        System.out.println(warn);
    }
}
