package fr.afcepf.ai93.diag6.api.data.autres;

import java.util.List;

import fr.afcepf.ai93.diag6.entity.diagnostic.Diagnostic;
import fr.afcepf.ai93.diag6.entity.erp.Erp;

public interface IDaoPublic {

	public List<Erp> afficherErpAuxNormes();

    public List<Erp> moyenneErpAuxNormes();

    public List<Erp> calculGraphiquePatrimoine();

    public List<Erp> calculErpParTypeDiagnostic(Diagnostic idTypeDiagnostic);

    public List<Erp> calculErpParTraite(Diagnostic traite);

    public void localisationErpGoogleMap();
}
