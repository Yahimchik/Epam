package by.yahimovich.task03classuml.insurance.view.manager;

import by.yahimovich.task03classuml.controller.CommandManager;
import by.yahimovich.task03classuml.controller.exception.ControllerException;
import by.yahimovich.task03classuml.controller.impl.*;
import by.yahimovich.task03classuml.insurance.entity.insurance.Derivatives;
import by.yahimovich.task03classuml.insurance.entity.insurance.derivativefactory.CreateDerivative;
import by.yahimovich.task03classuml.insurance.service.Service;
import by.yahimovich.task03classuml.insurance.view.dao.JsonDAO;
import by.yahimovich.task03classuml.insurance.view.dao.exception.DAOException;
import by.yahimovich.task03classuml.insurance.view.inputdata.IOData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Manager {

    public static final Logger LOGGER = LogManager.getLogger(Manager.class);
    IOData info = new IOData();
    JsonDAO<Derivatives> jsonDAO = new JsonDAO<>(Derivatives.class);
    List<Derivatives> list = new ArrayList<>();
    CommandManager manager = new CommandManager();


    public void show() throws IOException, ControllerException {
//        System.out.println("1 — eng\n 2 — bel\n any — default");
//        char i = 0;
//        try {
//            i = (char)System.in.read();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String country = "";
//        String language = "";
//        switch (i) {
//            case '1' -> {
//                country = "US";
//                language = "en";
//            }
//            case '2' -> {
//                country = "BY";
//                language = "be";
//            }
//        }
//        Locale current = new Locale(language, country);
//        ResourceBundle rb = ResourceBundle.getBundle("ui.properties", current);
//        String s1 = rb.getString("str1");
//        System.out.println(s1);
//        String s2 = rb.getString("str2");
//        System.out.println(s2);
//        String s3 = rb.getString("str3");
//        System.out.println(s3);
//        String s4 = rb.getString("str4");
//        System.out.println(s4);
//        String s5 = rb.getString("str5");
//        System.out.println(s5);
//        String s6 = rb.getString("str6");
//        System.out.println(s6);
//        String s7 = rb.getString("str7");
//        System.out.println(s7);
//        String s8 = rb.getString("str8");
//        System.out.println(s8);
//        String s9 = rb.getString("str9");
//        System.out.println(s9);
//        String s10 = rb.getString("str10");
//        System.out.println(s10);
//        String s11 = rb.getString("str11");
//        System.out.println(s11);
        while (true) {

            info.output("""
                                        
                    1. Create contract.
                    2. Read contract from json file.
                    3. Show all contracts.
                    4. Full price of damage.
                    5. Sort list by damage.
                    6. Sort list by Date.
                    7. Sort list by object.
                    8. Sort list by premium amount.
                    9. Sort list by type.
                                        
                    """);

            info.output("Enter number: ");
            int choice = info.input();

            if (choice == 0) {
                info.output("Exit...");
                break;
            }

            switch (choice) {
                case 1:
                    info.output();
                    List<Derivatives> derivatives = new ArrayList<>();
                    method(info.input(), derivatives);
                    jsonDAO.write(derivatives, "Insurance.json");
                    break;
                case 2:
                    try {
                        info.output("\nRead information from json file\n");
                        list = jsonDAO.read("Insurance.json");
                    } catch (DAOException e) {
                        LOGGER.debug("No such file!");
                    }
                    break;
                case 3:
                    info.output("\nALL CONTRACTS\n");
                    IOData.output(list);
                    break;
                case 4:
                    info.output("\nFull price of damage: ");
                    manager.executeOperation(new FullPrice(new Service(), list));
                    break;
                case 5:
                    info.output("Sort contracts by damage");
                    manager.executeOperation(new DamageComparator(new Service(), list));
                    break;
                case 6:
                    info.output("Sort contracts by date");
                    manager.executeOperation(new DateComparator(new Service(), list));
                    break;
                case 7:
                    info.output("Sort contracts by object");
                    manager.executeOperation(new ObjectComparator(new Service(), list));
                    break;
                case 8:
                    info.output("Sort contracts by premium amount");
                    manager.executeOperation(new PremiumAmountComparator(new Service(), list));
                    break;
                case 9:
                    info.output("Sort contracts by type");
                    manager.executeOperation(new TypeComparator(new Service(), list));
                    break;
                case 10:
                    info.output();
                    break;
                default:
                    break;
            }
        }
    }

    private void method(int index, List<Derivatives> derivatives) {
        for (int i = 0; i < index; ++i) {
            derivatives.add(new CreateDerivative().create());
        }
    }
}
