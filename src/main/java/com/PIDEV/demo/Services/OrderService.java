package com.PIDEV.demo.Services;

import com.PIDEV.demo.Entities.CommandLigne;
import com.PIDEV.demo.Entities.Facture;
import com.PIDEV.demo.Entities.Orderr;
import com.PIDEV.demo.Repositories.CommandLigneRep;
import com.PIDEV.demo.Repositories.FactureRep;
import com.PIDEV.demo.Repositories.OrderRep;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class OrderService implements IOrderService {

    private final OrderRep or;
    private final FactureRep fr;
    private final CommandLigneRep commandLigneRep;
    @Override
    public void ajoutOrder(Orderr order) {

        or.save(order);
    }

    @Override
    public void addFacture(Facture facture) {
        fr.save(facture);
    }

    @Override
    public void deleteOrder(int ido) {
        or.deleteById(ido);
    }

    @Override
    public Facture FacturesOfOrder(int ido) {
        Orderr order = or.findById(ido).orElse(null);
        return order.getFacture();
    }

    @Override
    public List<CommandLigne> listLigneCommand(int ido) {
       Orderr order = or.findById(ido).orElse(null);
       return (List<CommandLigne>) order.getCommandLignes();
    }

    @Override
    public List<CommandLigne> listcommandeligne(int idCmd) {
        CommandLigne cl = commandLigneRep.findById(idCmd).orElse(null);
        return (List<CommandLigne>) cl;
    }


}
