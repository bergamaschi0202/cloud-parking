package arthur.treinamento.cloud_parking.Repository;

import arthur.treinamento.cloud_parking.Model.Parking;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, String>{
}