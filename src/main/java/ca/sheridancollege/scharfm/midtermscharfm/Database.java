package ca.sheridancollege.scharfm.midtermscharfm;

import ca.sheridancollege.scharfm.midtermscharfm.CarItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Database extends JpaRepository<CarItem, Long> {
}
