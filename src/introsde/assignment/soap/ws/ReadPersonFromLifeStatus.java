
package introsde.assignment.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readPersonFromLifeStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readPersonFromLifeStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idLifeStatus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readPersonFromLifeStatus", propOrder = {
    "idLifeStatus"
})
public class ReadPersonFromLifeStatus {

    protected int idLifeStatus;

    /**
     * Gets the value of the idLifeStatus property.
     * 
     */
    public int getIdLifeStatus() {
        return idLifeStatus;
    }

    /**
     * Sets the value of the idLifeStatus property.
     * 
     */
    public void setIdLifeStatus(int value) {
        this.idLifeStatus = value;
    }

}
