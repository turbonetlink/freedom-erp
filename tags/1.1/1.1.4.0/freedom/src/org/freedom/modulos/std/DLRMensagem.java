/**
 * @version 14/07/2003 <BR>
 * @author Setpoint Inform�tica Ltda./Fernando Oliveira da Silva <BR>
 *
 * Projeto: Freedom <BR>
 *  
 * Pacote: org.freedom.modulos.std <BR>
 * Classe: @(#)DLRMensagem.java <BR>
 * 
 * Este programa � licenciado de acordo com a LPG-PC (Licen�a P�blica Geral para Programas de Computador), <BR>
 * vers�o 2.1.0 ou qualquer vers�o posterior. <BR>
 * A LPG-PC deve acompanhar todas PUBLICA��ES, DISTRIBUI��ES e REPRODU��ES deste Programa. <BR>
 * Caso uma c�pia da LPG-PC n�o esteja dispon�vel junto com este Programa, voc� pode contatar <BR>
 * o LICENCIADOR ou ent�o pegar uma c�pia em: <BR>
 * Licen�a: http://www.lpg.adv.br/licencas/lpgpc.rtf <BR>
 * Para poder USAR, PUBLICAR, DISTRIBUIR, REPRODUZIR ou ALTERAR este Programa � preciso estar <BR>
 * de acordo com os termos da LPG-PC <BR> <BR>
 *
 * Coment�rios sobre a classe...
 */

package org.freedom.modulos.std;
import org.freedom.componentes.JLabelPad;

import org.freedom.componentes.JRadioGroup;
import org.freedom.telas.FFDialogo;

import java.util.Vector;
public class DLRMensagem extends FFDialogo {

	private static final long serialVersionUID = 1L;

  private JRadioGroup<?, ?> rgOrdem = null;
  private JLabelPad lbOrdem = new JLabelPad("Ordenar por:");
  private Vector<String> vLabs = new Vector<String>();
  private Vector<String> vVals = new Vector<String>();
  public DLRMensagem() {
    setTitulo("Ordem do Relat�rio");
    setAtribos(300,120);
    vLabs.addElement("C�digo");
    vLabs.addElement("Mensagem");
    vVals.addElement("C");
    vVals.addElement("M");
    rgOrdem = new JRadioGroup<String, String>(1,2,vLabs,vVals);
    rgOrdem.setVlrString("M");
    adic(lbOrdem,7,0,80,15);
    adic(rgOrdem,7,20,280,30);
  }
  public String getValor() {
    String sRetorno = "";
    if (rgOrdem.getVlrString().compareTo("C") == 0 )
      sRetorno = "CODMENS";
    else if (rgOrdem.getVlrString().compareTo("M") == 0 )
      sRetorno = "MENS";
    return sRetorno;
  }
}