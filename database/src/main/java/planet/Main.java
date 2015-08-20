package planet;

import planet.dao.*;
import planet.dao.interfaces_dao.CrudGeneralDao;
import planet.entity.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oleksii on 09.08.15.
 */
public class Main {
    public static void main(String[] args){
        FinReportDaoImpl dao = new FinReportDaoImpl();
        List<FinReport> fr = new ArrayList<FinReport>();
        fr = dao.select();

        for (int i=0; i<fr.size(); i++)
        {
            System.out.print(fr.get(i).getOrderDate()+"\t");
            System.out.print(fr.get(i).getLogin()+"\t");
            System.out.print(fr.get(i).getProductName()+"\t");
            System.out.print(fr.get(i).getProductQty()+"\t");
            System.out.print(fr.get(i).getAmount()+"\n");
        }


    }

}
