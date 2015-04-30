package fr.afcepf.ai93.diag6.api.data.autres;

import java.util.List;

import fr.afcepf.ai93.diag6.entity.autres.Artisan;
import fr.afcepf.ai93.diag6.entity.travaux.TypeArtisan;

public interface IDaoArtisan {
	
	public List<Artisan> recupereToutArtisan();

    public void ajouterArtisan(Artisan Artisan);

    public boolean supprimerArtisan(Artisan Artisan);

    public List<TypeArtisan> recupereTypeArtisan();
}
