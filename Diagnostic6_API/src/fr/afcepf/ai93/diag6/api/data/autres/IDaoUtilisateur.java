package fr.afcepf.ai93.diag6.api.data.autres;

import java.util.List;

import fr.afcepf.ai93.diag6.entity.autres.Favoris;
import fr.afcepf.ai93.diag6.entity.autres.ProfilUtilisateur;
import fr.afcepf.ai93.diag6.entity.autres.Utilisateur;

public interface IDaoUtilisateur {

	public List<Utilisateur> recupereToutUtilisateur();

    public void ajouterUtilisateur(Utilisateur utilisateur);

    public boolean supprimerUtilisateur(Utilisateur utilisateur);

    public boolean modifierNomUtilisateur(Utilisateur nom);

    public boolean modifierPrenomUtilisateur(Utilisateur prenom);

    public boolean modifierEmailUtilisateur(Utilisateur email);

    public boolean modifierTelUtilisateur(Utilisateur telephone);

    public boolean modifierMdpUtilisateur(Utilisateur motDePasse);

    public List<ProfilUtilisateur> recupereToutProfil();

    public boolean modifierNomProfil(ProfilUtilisateur nomProfil);

    public List<Favoris> recupereToutFavoris();

    public void ajouterFavoris(Favoris favoris);

    public boolean supprimerFavoris(Favoris favoris);

    public List<Favoris> recupereErpFavoris();

    public List<Favoris> recupereDiagFavoris();

    public List<Favoris> recupereInterFavoris();

    public Utilisateur recupereUtilisateur(int idUtilisateur);

    public List<Utilisateur> trouverUtilisateur(String nom);
}
