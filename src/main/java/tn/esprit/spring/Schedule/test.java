package tn.esprit.spring.Schedule;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import tn.esprit.spring.DAO.Entities.Bloc;
import tn.esprit.spring.DAO.Repositories.BlocRepository;
import tn.esprit.spring.Services.ChamberService;
import tn.esprit.spring.Services.ReservationService;

import java.util.List;

@Component
@Slf4j //journalisation
@AllArgsConstructor
public class test {



    @Autowired
    ChamberService chamberService;
    @Autowired
    ReservationService reservationService;
    @Scheduled(fixedRate = 2000)
    void affiche(){

    }
    @Scheduled(cron = "* */1 * * * *")
        void afficheChambre(){
            chamberService.nbPlacesDisponibleParChambreAnneeEnCours();
        }

        @Scheduled(cron = "* * * 30 6 *")
    public void annulerRservation(){
        reservationService.annulertoutReservation();
        }






}
