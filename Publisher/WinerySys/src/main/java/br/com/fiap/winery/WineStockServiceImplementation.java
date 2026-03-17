package br.com.fiap.winery;

import jakarta.jws.WebService;

@WebService(
        endpointInterface = ""
)
public class WineStockServiceImplementation implements WineStockService {
    @Override
    public String getMenu() {
        return "Lista de Vinhos por Tipo de Uva:\n1 - Cabernet Sauvignon\n2 - Merlot\n3 - Pinot Noir\n4 - Chardonnay\n5 - Sauvignon Blanc\n";
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado!";
    }
}