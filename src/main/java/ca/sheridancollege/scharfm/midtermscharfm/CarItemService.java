package ca.sheridancollege.scharfm.midtermscharfm;

import ca.sheridancollege.scharfm.midtermscharfm.CarItem;
import ca.sheridancollege.scharfm.midtermscharfm.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarItemService {

    @Autowired
    private Database database;

    public List<CarItem> getAllCarItems() {
        return database.findAll();
    }

    public void addCarItem(CarItem carItem) {
        database.save(carItem);
    }

    public void deleteCarItem(Long id) {
        database.deleteById(id);
    }
}

