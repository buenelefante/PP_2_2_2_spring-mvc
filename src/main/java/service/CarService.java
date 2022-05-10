package service;

import model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {

    public static List<Car> carsList(List<Car> list, int pieceofshit ) {
        if (pieceofshit  == 0 || pieceofshit  > 5) return list;
        return list.stream().limit(pieceofshit ).collect(Collectors.toList());
    }

//    public List<Car> findCar() {
//        return listCar();
//    }
//
//    public List<Car> listCar() {
//        List<Car> cars=new ArrayList<>();
//        String[] models={"Uaz", "Lada", "Volga", "Gaz", "Kamaz"};
//        String[] colors={"yellow","black", "green", "blue", "orange"};
//        String[] year={"1987","2001", "1977", "2011", "2022"};
//
//        for (int i=0; i<5; i++ ){
//            cars.add(new Car(models[i],colors[i], year[i] ));
//        }
//        return cars;
//    }

}
