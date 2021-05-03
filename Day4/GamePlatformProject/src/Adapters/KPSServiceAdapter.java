package Adapters;

import java.rmi.RemoteException;

import Abstract.CheckPersonService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;



public class KPSServiceAdapter implements CheckPersonService{

	@Override
	public boolean checkPerson(Gamer gamer) {
		
		KPSPublicSoap service=new KPSPublicSoapProxy();
		try {
		return	service.TCKimlikNoDogrula(Long.parseLong(gamer.identityNumber), gamer.firstName, gamer.lastName, gamer.birthOfDate.getYear());
		} catch (NumberFormatException | RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
