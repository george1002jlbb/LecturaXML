/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lecturaxml;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Jorge Bermudez
 */
public class LecturaXml {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JDOMException {
        // TODO code application logic here
        File archivoxml = new File("D:/xmlfiles/Fraccionadas.xml");

        SAXBuilder builder = new SAXBuilder();

        int verificados = 0;

        try {
            Document document = (Document) builder.build(archivoxml);
            Element rootNode = document.getRootElement();
            List list = rootNode.getChildren("info");

            for (int i = 0; i < list.size(); i++) {
                Element arbol = (Element) list.get(i);
                String rama = arbol.getAttributeValue("nombre");
                List lista_campos = arbol.getChildren();
//                System.out.println("rama " + rama + " campos " + lista_campos.size());

                for (int j = 0; j < lista_campos.size(); j++) {
                    Element campo = (Element) lista_campos.get(j);

                    // ARTICULOS
//                    if (rama.equalsIgnoreCase("login")) {
//                        System.out.println("usuario "+campo.getChildTextTrim("usuario"));
//                        System.out.println("clave "+campo.getChildTextTrim("clave"));
//                    }
//                    
//                    if (rama.equalsIgnoreCase("articulo")) {
//                        System.out.println("codarticulo "+campo.getChildTextTrim("codarticulo"));
//                        System.out.println("cencosto "+campo.getChildTextTrim("cencosto"));
//                        System.out.println("desccorta "+campo.getChildTextTrim("desccorta"));
//                        System.out.println("desclarga "+campo.getChildTextTrim("desclarga"));
//                        System.out.println("conversion "+campo.getChildTextTrim("conversion"));
//                        System.out.println("tipo "+campo.getChildTextTrim("tipo"));
//                        System.out.println("unidadmedida "+campo.getChildTextTrim("unidadmedida"));
//                        System.out.println("subpartida "+campo.getChildTextTrim("subpartida"));
//                    }
                    // ORDENES DE PRODUCCION
//                    if (rama.equalsIgnoreCase("login")) {
//                        System.out.println("usuario " + campo.getChildTextTrim("usuario"));
//                        System.out.println("clave " + campo.getChildTextTrim("clave"));
//                    }
//
//                    if (rama.equalsIgnoreCase("nroorden")) {
//                        System.out.println("numeroorden " + campo.getChildTextTrim("numeroorden"));
//                    }
//
//                    if ((verificados) == lista_campos.size()) {
//
//                        if (rama.equalsIgnoreCase("ordenproduccion")) {
//
//                            if (campo.getAttributeValue("nombre").equalsIgnoreCase("infopadre")) {
//                                System.out.println("matriz " + campo.getChildTextTrim("matriz"));
//                                System.out.println("cantidad " + campo.getChildTextTrim("cantidad"));
//                            }
//
//                            if (campo.getAttributeValue("nombre").equalsIgnoreCase("infocomponente")) {
//                                System.out.println("componente " + campo.getChildTextTrim("componente"));
//                                System.out.println("consumoreal " + campo.getChildTextTrim("consumoreal"));
//                                System.out.println("desperdicioreal " + campo.getChildTextTrim("desperdicioreal"));
//                                System.out.println("precio " + campo.getChildTextTrim("precio"));
//                            }
//                            //System.out.println("verificados " + verificados + " campos " + lista_campos.size());
//                        }
//
//                    } else {
//
//                        for (int k = 0; k < lista_campos.size(); k++) {
//                            if (rama.equalsIgnoreCase("ordenproduccion")) {
//                                if (campo.getAttributeValue("nombre").equalsIgnoreCase("infopadre")) {
//                                    //System.out.println("matriz " + campo.getChildTextTrim("matriz"));
//                                    //System.out.println("cantidad " + campo.getChildTextTrim("cantidad"));
//                                }
//
//                                if (campo.getAttributeValue("nombre").equalsIgnoreCase("infocomponente")) {
//                                    //System.out.println("componente " + campo.getChildTextTrim("componente"));
//                                    //System.out.println("consumoreal " + campo.getChildTextTrim("consumoreal"));
//                                    //System.out.println("desperdicioreal " + campo.getChildTextTrim("desperdicioreal"));
//                                    //System.out.println("precio " + campo.getChildTextTrim("precio"));
//                                }
//                                //System.out.println("" + verificados++);
//                                verificados = k + 1;
//                            }
//
//                        }
//
//                    }
                    //FORMULARIOS ENTRADA & SALIDA
//                    if (rama.equalsIgnoreCase("login")) {
//                        System.out.println("usuario " + campo.getChildTextTrim("usuario"));
//                        System.out.println("clave " + campo.getChildTextTrim("clave"));
//                    }
//
//                    if (rama.equalsIgnoreCase("inicio")) {
//                        System.out.println("transaccion " + campo.getChildTextTrim("transaccion"));
//                    }
//
//                    if (rama.equalsIgnoreCase("general")) {
//                        System.out.println("nittercero " + campo.getChildTextTrim("nittercero"));
//                        System.out.println("doctransporte " + campo.getChildTextTrim("doctransporte"));
//                        System.out.println("docexportacion " + campo.getChildTextTrim("docexportacion"));
//                        System.out.println("regimportacion " + campo.getChildTextTrim("regimportacion"));
//                        System.out.println("numfactura " + campo.getChildTextTrim("numfactura"));
//                        System.out.println("observaciones " + campo.getChildTextTrim("observaciones"));
//                    }
//
//                    if (rama.equalsIgnoreCase("subpartida")) {
//                        if (campo.getAttributeValue("nombre").equalsIgnoreCase("infosp")) {
//                            System.out.println("codsubpartida " + campo.getChildTextTrim("codsubpartida"));
//                            System.out.println("codempaque " + campo.getChildTextTrim("codempaque"));
//                            System.out.println("pesobruto " + campo.getChildTextTrim("pesobruto"));
//                            System.out.println("pesoneto " + campo.getChildTextTrim("pesoneto"));
//                            System.out.println("nbultos " + campo.getChildTextTrim("nbultos"));
//                            System.out.println("codtransporte " + campo.getChildTextTrim("codtransporte"));
//                            System.out.println("codbandera " + campo.getChildTextTrim("codbandera"));
//                            System.out.println("codpaisorigen " + campo.getChildTextTrim("codpaisorigen"));
//                            System.out.println("codpaiscompra " + campo.getChildTextTrim("codpaiscompra"));
//                            System.out.println("codpaisdestino " + campo.getChildTextTrim("codpaisdestino"));
//                            System.out.println("codpaisprocedencia " + campo.getChildTextTrim("codpaisprocedencia"));
//                            System.out.println("tasacambio " + campo.getChildTextTrim("tasacambio"));
//                            System.out.println("flete " + campo.getChildTextTrim("flete"));
//                            System.out.println("seguro " + campo.getChildTextTrim("seguro"));
//                            System.out.println("otrosgastos " + campo.getChildTextTrim("otrosgastos"));
//                        }
//
//                        if (campo.getAttributeValue("nombre").equalsIgnoreCase("infoart")) {
//                            System.out.println("codarticulo " + campo.getChildTextTrim("codarticulo"));
//                            System.out.println("cantidad " + campo.getChildTextTrim("cantidad"));
//                            System.out.println("precio " + campo.getChildTextTrim("precio"));
//                        }
//                    }// rama subpartida\
                    // FRACCIONADOS
                    if (rama.equalsIgnoreCase("login")) {
                        System.out.println("usuario " + campo.getChildTextTrim("usuario"));
                        System.out.println("clave " + campo.getChildTextTrim("clave"));
                    }

                    if (rama.equalsIgnoreCase("inicio")) {
                        System.out.println("consecutivocia " + campo.getChildTextTrim("consecutivocia"));
                    }

                    if (rama.equalsIgnoreCase("salida")) {
                        System.out.println("codarticulo " + campo.getChildTextTrim("codarticulo"));
                        System.out.println("cantidad " + campo.getChildTextTrim("cantidad"));
                        System.out.println("observacion " + campo.getChildTextTrim("observacion"));
                    }

                }// for lista_campos

            } // for list nodo info

        } catch (IOException io) {
            System.out.println(io.getMessage());
        } catch (JDOMException io) {
            System.out.println(io.getMessage());
        }
    }

}
