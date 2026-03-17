package br.com.fiap.winery;

import jakarta.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import stubclasses.WineStockServiceImplementation;

public class ApplicationClient1 {
    public static void main(String[] args) throws MalformedURLException {
        String WSDL = "http://localhost:8085/WineStockService?wsdl";
        String TARGET = "http://winery.fiap.com.br/";
        String NAME = "WineStockServiceImplementationService";
        URL url = new URL("http://localhost:8085/WineStockService?wsdl");
        QName qName = new QName("http://winery.fiap.com.br/", "WineStockServiceImplementationService");
        Service service = Service.create(url, qName);
        WineStockServiceImplementation wineStockService = (WineStockServiceImplementation)service.getPort(WineStockServiceImplementation.class);
        String menu = wineStockService.getMenu();
        System.out.printf(menu);
    }
}
