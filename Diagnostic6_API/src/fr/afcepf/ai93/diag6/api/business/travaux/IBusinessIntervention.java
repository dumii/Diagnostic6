package fr.afcepf.ai93.diag6.api.business.travaux;

import java.util.Date;
import java.util.List;

import fr.afcepf.ai93.diag6.entity.travaux.HistoriqueIntervention;
import fr.afcepf.ai93.diag6.entity.travaux.Intervention;

public interface IBusinessIntervention {
	
    public List<Intervention> recupereToutesIntervention();

    public void ajouterIntervention(Intervention intervention);

    public boolean modifierInterventionAnomalie(int idAnomalie);

    public boolean modifierInterventionArtisan(int idArtisan);

    public boolean modifierInterventionType(int idType);

    public boolean majInterventionDebut(Date date);

    public boolean majInterventionFin(Date date);

    public boolean majInterventionCout(double coute);

    public boolean majInterventionEtatAvancement(int idAvancement);

    public List<HistoriqueIntervention> recupereToutHistoriqueIntervention();

    public Intervention recupereIntervention(int idIntervention);

    public List<Intervention> rechercheInterventions(String nomIntervention);
}
