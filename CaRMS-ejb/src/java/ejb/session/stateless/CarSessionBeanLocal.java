/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb.session.stateless;

import entity.Car;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Jester
 */
@Local
public interface CarSessionBeanLocal {

    public Long createNewCra(Car car);

    public List<Car> retrieveAllCars();    
}
