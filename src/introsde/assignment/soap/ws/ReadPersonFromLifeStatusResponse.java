
package introsde.assignment.soap.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for readPersonFromLifeStatusResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="readPersonFromLifeStatusResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="readPersonFromLifeStatus" type="{http://ws.soap.assignment.introsde/}person" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "readPersonFromLifeStatusResponse", propOrder = {
    "readPersonFromLifeStatus"
})
public class ReadPersonFromLifeStatusResponse {

    protected Person readPersonFromLifeStatus;

    /**
     * Gets the value of the readPersonFromLifeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getReadPersonFromLifeStatus() {
        return readPersonFromLifeStatus;
    }

    /**
     * Sets the value of the readPersonFromLifeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setReadPersonFromLifeStatus(Person value) {
        this.readPersonFromLifeStatus = value;
    }

}
