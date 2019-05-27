package APIs;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface itfSistAutorizacionFacebook extends Remote
{
	public boolean ValidarUsuario (String email) throws RemoteException;
}
