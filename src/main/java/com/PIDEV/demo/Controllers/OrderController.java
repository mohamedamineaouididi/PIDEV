package com.PIDEV.demo.Controllers;

import com.PIDEV.demo.Entities.Facture;
import com.PIDEV.demo.Entities.Orderr;
import com.PIDEV.demo.Services.IOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Order")
@RequiredArgsConstructor
public class OrderController {

   private final IOrderService os;

    @PostMapping("/add-Order")
    public void addOrder(@RequestBody Orderr o){
        os.ajoutOrder(o);
    }

    @PostMapping("/add-Facture")
    public void addFacture(@RequestBody Facture f){
        os.addFacture(f);
    }

    @GetMapping("/Facture/{id-order}")
    public Facture FactureOfOrder(@PathVariable("id-order")int idOrder) {
        return os.FacturesOfOrder(idOrder);//centreCommercialService.listeBoutique(idCentre);
    }




}
