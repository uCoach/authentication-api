
package introsde.assignment.soap.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the introsde.assignment.soap.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeletePersonByIdResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "deletePersonByIdResponse");
    private final static QName _ReadPersonFromLifeStatus_QNAME = new QName("http://ws.soap.assignment.introsde/", "readPersonFromLifeStatus");
    private final static QName _ReadPersonFromLifeStatusResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "readPersonFromLifeStatusResponse");
    private final static QName _UpdatePersonHealthProfileResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "updatePersonHealthProfileResponse");
    private final static QName _ReadMeasureTypesResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "readMeasureTypesResponse");
    private final static QName _GetMeasureTypeResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "getMeasureTypeResponse");
    private final static QName _DeletePersonById_QNAME = new QName("http://ws.soap.assignment.introsde/", "deletePersonById");
    private final static QName _ReadPersonList_QNAME = new QName("http://ws.soap.assignment.introsde/", "readPersonList");
    private final static QName _DeletePersonResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "deletePersonResponse");
    private final static QName _GetSingleMeasureType_QNAME = new QName("http://ws.soap.assignment.introsde/", "getSingleMeasureType");
    private final static QName _UpdatePersonMeasureResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "updatePersonMeasureResponse");
    private final static QName _ReadPersonListResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "readPersonListResponse");
    private final static QName _UpdatePersonMeasure_QNAME = new QName("http://ws.soap.assignment.introsde/", "updatePersonMeasure");
    private final static QName _ReadLifeStatusResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "readLifeStatusResponse");
    private final static QName _ReadMeasureTypes_QNAME = new QName("http://ws.soap.assignment.introsde/", "readMeasureTypes");
    private final static QName _CreatePerson_QNAME = new QName("http://ws.soap.assignment.introsde/", "createPerson");
    private final static QName _SavePersonMeasure_QNAME = new QName("http://ws.soap.assignment.introsde/", "savePersonMeasure");
    private final static QName _SavePersonMeasureResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "savePersonMeasureResponse");
    private final static QName _GetSingleMeasureTypeResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "getSingleMeasureTypeResponse");
    private final static QName _DeletePerson_QNAME = new QName("http://ws.soap.assignment.introsde/", "deletePerson");
    private final static QName _CreatePersonResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "createPersonResponse");
    private final static QName _GetMeasureType_QNAME = new QName("http://ws.soap.assignment.introsde/", "getMeasureType");
    private final static QName _ReadPersonMeasureResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "readPersonMeasureResponse");
    private final static QName _ReadLifeStatus_QNAME = new QName("http://ws.soap.assignment.introsde/", "readLifeStatus");
    private final static QName _UpdatePerson_QNAME = new QName("http://ws.soap.assignment.introsde/", "updatePerson");
    private final static QName _UpdatePersonHealthProfile_QNAME = new QName("http://ws.soap.assignment.introsde/", "updatePersonHealthProfile");
    private final static QName _ReadPersonMeasure_QNAME = new QName("http://ws.soap.assignment.introsde/", "readPersonMeasure");
    private final static QName _ReadPerson_QNAME = new QName("http://ws.soap.assignment.introsde/", "readPerson");
    private final static QName _ReadPersonResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "readPersonResponse");
    private final static QName _UpdatePersonResponse_QNAME = new QName("http://ws.soap.assignment.introsde/", "updatePersonResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: introsde.assignment.soap.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReadMeasureTypesResponse }
     * 
     */
    public ReadMeasureTypesResponse createReadMeasureTypesResponse() {
        return new ReadMeasureTypesResponse();
    }

    /**
     * Create an instance of {@link ReadPersonFromLifeStatusResponse }
     * 
     */
    public ReadPersonFromLifeStatusResponse createReadPersonFromLifeStatusResponse() {
        return new ReadPersonFromLifeStatusResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonHealthProfileResponse }
     * 
     */
    public UpdatePersonHealthProfileResponse createUpdatePersonHealthProfileResponse() {
        return new UpdatePersonHealthProfileResponse();
    }

    /**
     * Create an instance of {@link ReadPersonFromLifeStatus }
     * 
     */
    public ReadPersonFromLifeStatus createReadPersonFromLifeStatus() {
        return new ReadPersonFromLifeStatus();
    }

    /**
     * Create an instance of {@link DeletePersonByIdResponse }
     * 
     */
    public DeletePersonByIdResponse createDeletePersonByIdResponse() {
        return new DeletePersonByIdResponse();
    }

    /**
     * Create an instance of {@link ReadPersonListResponse }
     * 
     */
    public ReadPersonListResponse createReadPersonListResponse() {
        return new ReadPersonListResponse();
    }

    /**
     * Create an instance of {@link DeletePersonResponse }
     * 
     */
    public DeletePersonResponse createDeletePersonResponse() {
        return new DeletePersonResponse();
    }

    /**
     * Create an instance of {@link GetSingleMeasureType }
     * 
     */
    public GetSingleMeasureType createGetSingleMeasureType() {
        return new GetSingleMeasureType();
    }

    /**
     * Create an instance of {@link UpdatePersonMeasureResponse }
     * 
     */
    public UpdatePersonMeasureResponse createUpdatePersonMeasureResponse() {
        return new UpdatePersonMeasureResponse();
    }

    /**
     * Create an instance of {@link ReadPersonList }
     * 
     */
    public ReadPersonList createReadPersonList() {
        return new ReadPersonList();
    }

    /**
     * Create an instance of {@link DeletePersonById }
     * 
     */
    public DeletePersonById createDeletePersonById() {
        return new DeletePersonById();
    }

    /**
     * Create an instance of {@link GetMeasureTypeResponse }
     * 
     */
    public GetMeasureTypeResponse createGetMeasureTypeResponse() {
        return new GetMeasureTypeResponse();
    }

    /**
     * Create an instance of {@link DeletePerson }
     * 
     */
    public DeletePerson createDeletePerson() {
        return new DeletePerson();
    }

    /**
     * Create an instance of {@link CreatePersonResponse }
     * 
     */
    public CreatePersonResponse createCreatePersonResponse() {
        return new CreatePersonResponse();
    }

    /**
     * Create an instance of {@link SavePersonMeasure }
     * 
     */
    public SavePersonMeasure createSavePersonMeasure() {
        return new SavePersonMeasure();
    }

    /**
     * Create an instance of {@link SavePersonMeasureResponse }
     * 
     */
    public SavePersonMeasureResponse createSavePersonMeasureResponse() {
        return new SavePersonMeasureResponse();
    }

    /**
     * Create an instance of {@link GetSingleMeasureTypeResponse }
     * 
     */
    public GetSingleMeasureTypeResponse createGetSingleMeasureTypeResponse() {
        return new GetSingleMeasureTypeResponse();
    }

    /**
     * Create an instance of {@link CreatePerson }
     * 
     */
    public CreatePerson createCreatePerson() {
        return new CreatePerson();
    }

    /**
     * Create an instance of {@link ReadMeasureTypes }
     * 
     */
    public ReadMeasureTypes createReadMeasureTypes() {
        return new ReadMeasureTypes();
    }

    /**
     * Create an instance of {@link ReadLifeStatusResponse }
     * 
     */
    public ReadLifeStatusResponse createReadLifeStatusResponse() {
        return new ReadLifeStatusResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonMeasure }
     * 
     */
    public UpdatePersonMeasure createUpdatePersonMeasure() {
        return new UpdatePersonMeasure();
    }

    /**
     * Create an instance of {@link UpdatePersonResponse }
     * 
     */
    public UpdatePersonResponse createUpdatePersonResponse() {
        return new UpdatePersonResponse();
    }

    /**
     * Create an instance of {@link ReadPersonResponse }
     * 
     */
    public ReadPersonResponse createReadPersonResponse() {
        return new ReadPersonResponse();
    }

    /**
     * Create an instance of {@link ReadPerson }
     * 
     */
    public ReadPerson createReadPerson() {
        return new ReadPerson();
    }

    /**
     * Create an instance of {@link UpdatePersonHealthProfile }
     * 
     */
    public UpdatePersonHealthProfile createUpdatePersonHealthProfile() {
        return new UpdatePersonHealthProfile();
    }

    /**
     * Create an instance of {@link ReadPersonMeasure }
     * 
     */
    public ReadPersonMeasure createReadPersonMeasure() {
        return new ReadPersonMeasure();
    }

    /**
     * Create an instance of {@link GetMeasureType }
     * 
     */
    public GetMeasureType createGetMeasureType() {
        return new GetMeasureType();
    }

    /**
     * Create an instance of {@link ReadPersonMeasureResponse }
     * 
     */
    public ReadPersonMeasureResponse createReadPersonMeasureResponse() {
        return new ReadPersonMeasureResponse();
    }

    /**
     * Create an instance of {@link ReadLifeStatus }
     * 
     */
    public ReadLifeStatus createReadLifeStatus() {
        return new ReadLifeStatus();
    }

    /**
     * Create an instance of {@link UpdatePerson }
     * 
     */
    public UpdatePerson createUpdatePerson() {
        return new UpdatePerson();
    }

    /**
     * Create an instance of {@link LifeStatus }
     * 
     */
    public LifeStatus createLifeStatus() {
        return new LifeStatus();
    }

    /**
     * Create an instance of {@link MeasureDefinition }
     * 
     */
    public MeasureDefinition createMeasureDefinition() {
        return new MeasureDefinition();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "deletePersonByIdResponse")
    public JAXBElement<DeletePersonByIdResponse> createDeletePersonByIdResponse(DeletePersonByIdResponse value) {
        return new JAXBElement<DeletePersonByIdResponse>(_DeletePersonByIdResponse_QNAME, DeletePersonByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonFromLifeStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readPersonFromLifeStatus")
    public JAXBElement<ReadPersonFromLifeStatus> createReadPersonFromLifeStatus(ReadPersonFromLifeStatus value) {
        return new JAXBElement<ReadPersonFromLifeStatus>(_ReadPersonFromLifeStatus_QNAME, ReadPersonFromLifeStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonFromLifeStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readPersonFromLifeStatusResponse")
    public JAXBElement<ReadPersonFromLifeStatusResponse> createReadPersonFromLifeStatusResponse(ReadPersonFromLifeStatusResponse value) {
        return new JAXBElement<ReadPersonFromLifeStatusResponse>(_ReadPersonFromLifeStatusResponse_QNAME, ReadPersonFromLifeStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonHealthProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "updatePersonHealthProfileResponse")
    public JAXBElement<UpdatePersonHealthProfileResponse> createUpdatePersonHealthProfileResponse(UpdatePersonHealthProfileResponse value) {
        return new JAXBElement<UpdatePersonHealthProfileResponse>(_UpdatePersonHealthProfileResponse_QNAME, UpdatePersonHealthProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readMeasureTypesResponse")
    public JAXBElement<ReadMeasureTypesResponse> createReadMeasureTypesResponse(ReadMeasureTypesResponse value) {
        return new JAXBElement<ReadMeasureTypesResponse>(_ReadMeasureTypesResponse_QNAME, ReadMeasureTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "getMeasureTypeResponse")
    public JAXBElement<GetMeasureTypeResponse> createGetMeasureTypeResponse(GetMeasureTypeResponse value) {
        return new JAXBElement<GetMeasureTypeResponse>(_GetMeasureTypeResponse_QNAME, GetMeasureTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "deletePersonById")
    public JAXBElement<DeletePersonById> createDeletePersonById(DeletePersonById value) {
        return new JAXBElement<DeletePersonById>(_DeletePersonById_QNAME, DeletePersonById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readPersonList")
    public JAXBElement<ReadPersonList> createReadPersonList(ReadPersonList value) {
        return new JAXBElement<ReadPersonList>(_ReadPersonList_QNAME, ReadPersonList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "deletePersonResponse")
    public JAXBElement<DeletePersonResponse> createDeletePersonResponse(DeletePersonResponse value) {
        return new JAXBElement<DeletePersonResponse>(_DeletePersonResponse_QNAME, DeletePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSingleMeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "getSingleMeasureType")
    public JAXBElement<GetSingleMeasureType> createGetSingleMeasureType(GetSingleMeasureType value) {
        return new JAXBElement<GetSingleMeasureType>(_GetSingleMeasureType_QNAME, GetSingleMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "updatePersonMeasureResponse")
    public JAXBElement<UpdatePersonMeasureResponse> createUpdatePersonMeasureResponse(UpdatePersonMeasureResponse value) {
        return new JAXBElement<UpdatePersonMeasureResponse>(_UpdatePersonMeasureResponse_QNAME, UpdatePersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readPersonListResponse")
    public JAXBElement<ReadPersonListResponse> createReadPersonListResponse(ReadPersonListResponse value) {
        return new JAXBElement<ReadPersonListResponse>(_ReadPersonListResponse_QNAME, ReadPersonListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "updatePersonMeasure")
    public JAXBElement<UpdatePersonMeasure> createUpdatePersonMeasure(UpdatePersonMeasure value) {
        return new JAXBElement<UpdatePersonMeasure>(_UpdatePersonMeasure_QNAME, UpdatePersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadLifeStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readLifeStatusResponse")
    public JAXBElement<ReadLifeStatusResponse> createReadLifeStatusResponse(ReadLifeStatusResponse value) {
        return new JAXBElement<ReadLifeStatusResponse>(_ReadLifeStatusResponse_QNAME, ReadLifeStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadMeasureTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readMeasureTypes")
    public JAXBElement<ReadMeasureTypes> createReadMeasureTypes(ReadMeasureTypes value) {
        return new JAXBElement<ReadMeasureTypes>(_ReadMeasureTypes_QNAME, ReadMeasureTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "createPerson")
    public JAXBElement<CreatePerson> createCreatePerson(CreatePerson value) {
        return new JAXBElement<CreatePerson>(_CreatePerson_QNAME, CreatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "savePersonMeasure")
    public JAXBElement<SavePersonMeasure> createSavePersonMeasure(SavePersonMeasure value) {
        return new JAXBElement<SavePersonMeasure>(_SavePersonMeasure_QNAME, SavePersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SavePersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "savePersonMeasureResponse")
    public JAXBElement<SavePersonMeasureResponse> createSavePersonMeasureResponse(SavePersonMeasureResponse value) {
        return new JAXBElement<SavePersonMeasureResponse>(_SavePersonMeasureResponse_QNAME, SavePersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSingleMeasureTypeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "getSingleMeasureTypeResponse")
    public JAXBElement<GetSingleMeasureTypeResponse> createGetSingleMeasureTypeResponse(GetSingleMeasureTypeResponse value) {
        return new JAXBElement<GetSingleMeasureTypeResponse>(_GetSingleMeasureTypeResponse_QNAME, GetSingleMeasureTypeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "deletePerson")
    public JAXBElement<DeletePerson> createDeletePerson(DeletePerson value) {
        return new JAXBElement<DeletePerson>(_DeletePerson_QNAME, DeletePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "createPersonResponse")
    public JAXBElement<CreatePersonResponse> createCreatePersonResponse(CreatePersonResponse value) {
        return new JAXBElement<CreatePersonResponse>(_CreatePersonResponse_QNAME, CreatePersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "getMeasureType")
    public JAXBElement<GetMeasureType> createGetMeasureType(GetMeasureType value) {
        return new JAXBElement<GetMeasureType>(_GetMeasureType_QNAME, GetMeasureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasureResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readPersonMeasureResponse")
    public JAXBElement<ReadPersonMeasureResponse> createReadPersonMeasureResponse(ReadPersonMeasureResponse value) {
        return new JAXBElement<ReadPersonMeasureResponse>(_ReadPersonMeasureResponse_QNAME, ReadPersonMeasureResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadLifeStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readLifeStatus")
    public JAXBElement<ReadLifeStatus> createReadLifeStatus(ReadLifeStatus value) {
        return new JAXBElement<ReadLifeStatus>(_ReadLifeStatus_QNAME, ReadLifeStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "updatePerson")
    public JAXBElement<UpdatePerson> createUpdatePerson(UpdatePerson value) {
        return new JAXBElement<UpdatePerson>(_UpdatePerson_QNAME, UpdatePerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonHealthProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "updatePersonHealthProfile")
    public JAXBElement<UpdatePersonHealthProfile> createUpdatePersonHealthProfile(UpdatePersonHealthProfile value) {
        return new JAXBElement<UpdatePersonHealthProfile>(_UpdatePersonHealthProfile_QNAME, UpdatePersonHealthProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonMeasure }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readPersonMeasure")
    public JAXBElement<ReadPersonMeasure> createReadPersonMeasure(ReadPersonMeasure value) {
        return new JAXBElement<ReadPersonMeasure>(_ReadPersonMeasure_QNAME, ReadPersonMeasure.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readPerson")
    public JAXBElement<ReadPerson> createReadPerson(ReadPerson value) {
        return new JAXBElement<ReadPerson>(_ReadPerson_QNAME, ReadPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReadPersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "readPersonResponse")
    public JAXBElement<ReadPersonResponse> createReadPersonResponse(ReadPersonResponse value) {
        return new JAXBElement<ReadPersonResponse>(_ReadPersonResponse_QNAME, ReadPersonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePersonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.soap.assignment.introsde/", name = "updatePersonResponse")
    public JAXBElement<UpdatePersonResponse> createUpdatePersonResponse(UpdatePersonResponse value) {
        return new JAXBElement<UpdatePersonResponse>(_UpdatePersonResponse_QNAME, UpdatePersonResponse.class, null, value);
    }

}
