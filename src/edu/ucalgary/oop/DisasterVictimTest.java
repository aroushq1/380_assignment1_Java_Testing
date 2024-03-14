public class DisasterVictimTest {
    // Instance of DisasterVictim for testing
    private DisasterVictim victim;

    @Before
    public void setUp() {
        // Initialize a DisasterVictim instance with name "David", entry date "2024-02-17", and age 32
        victim = new DisasterVictim("Louis", "2024-01-20", 25);
    }

    @Test
    public void testConstructorWithAge() {
        // Test constructor with age as parameter
        assertEquals("Louis", victim.getFirstName());
        assertEquals("2024-01-20", victim.getEntryDate());
        assertEquals("25", victim.getAge());
    }

    @Test
    public void testConstructorWithDateOfBirth() {
        // Test constructor with date of birth as parameter
        DisasterVictim victimWithDOB = new DisasterVictim("Angelina", "2024-02-18", "1994-01-01");
        assertEquals("Angelina", victimWithDOB.getFirstName());
        assertEquals("2024-02-18", victimWithDOB.getEntryDate());
        assertEquals("1994-01-01", victimWithDOB.getDateOfBirth());
    }

    @Test
    public void testSetAndGetComments() {
        // Test setting and getting comments for the victim
        victim.setComments("Some comments");
        assertEquals("Some comments", victim.getComments());
    }

    @Test
    public void testSetAndGetMedicalRecords() {
        // Create a Location object
        Location location = new Location("Louis", "Canada");
        MedicalRecord record = new MedicalRecord(location, "some particular condition", "2024-01-20");
        ArrayList<MedicalRecord> medicalRecords = new ArrayList<>();
        medicalRecords.add(record);
        victim.setMedicalRecords(medicalRecords);
        assertEquals(1, victim.getMedicalRecords().length);
        assertEquals("Some particular condition", victim.getMedicalRecords()[0].getTreatmentDetails());
    }

    @Test
    public void testSetAndGetPersonalBelongings() {
        ArrayList<Supply> personalBelongings = new ArrayList<>();
        Supply supply = new Supply("Water", 10);
        personalBelongings.add(supply);
        victim.setPersonalBelongings(personalBelongings);
        assertEquals(1, victim.getPersonalBelongings().size());
        assertEquals("Water", victim.getPersonalBelongings().get(0).getType());
        assertEquals(10, victim.getPersonalBelongings().get(0).getQuantity());
    }

    @Test
    public void testSetAndGetFamilyConnections() {
        DisasterVictim personOne = new DisasterVictim("Louis", "2024-01-20", 30);
        DisasterVictim personTwo = new DisasterVictim("Angelina", "2024-02-18", 25);
        FamilyRelation relation = new FamilyRelation(personOne, "Sibling", personTwo);
        ArrayList<FamilyRelation> familyConnections = new ArrayList<>();
        familyConnections.add(relation);
        victim.setFamilyConnections(familyConnections);
        assertEquals(1, victim.getFamilyConnections().size());
        assertEquals("Sibling", victim.getFamilyConnections().get(0).getRelationshipTo());
        assertEquals("Louis", victim.getFamilyConnections().get(0).getPersonOne().getFirstName());
        assertEquals("Angelina", victim.getFamilyConnections().get(0).getPersonTwo().getFirstName());
    }

    @Test
    public void testRemovePersonalBelonging() {
        ArrayList<Supply> personalBelongings = new ArrayList<>();
        Supply supply = new Supply("Water", 10);
        personalBelongings.add(supply);
        victim.setPersonalBelongings(personalBelongings);
        victim.removePersonalBelonging(supply);
        assertEquals(0, victim.getPersonalBelongings().size());
    }

    @Test
    public void testAddPersonalBelonging() {
        Supply supply = new Supply("Food", 5);
        victim.addPersonalBelonging(supply);
        assertEquals(1, victim.getPersonalBelongings().size());
        assertEquals("Food", victim.getPersonalBelongings().get(0).getType());
        assertEquals(5, victim.getPersonalBelongings().get(0).getQuantity());
    }

    @Test
    public void testAddFamilyConnection() {
        DisasterVictim person = new DisasterVictim("Alice", "2024-03-12", 25);
        FamilyRelation relation = new FamilyRelation(person, "Sibling", victim);
        victim.addFamilyConnection(relation);

        assertEquals(1, victim.getFamilyConnections().size());
        assertEquals("Sibling", victim.getFamilyConnections().get(0).getRelationshipTo());
        assertEquals("Alice", victim.getFamilyConnections().get(0).getPersonOne().getFirstName());
        assertEquals("John", victim.getFamilyConnections().get(0).getPersonTwo().getFirstName());
    }

    @Test
    public void testRemoveFamilyConnection() {
        FamilyRelation relation = new FamilyRelation(victim, "Sibling", new DisasterVictim("Alice", "2024-03-12", 25));
        victim.addFamilyConnection(relation);
        victim.removeFamilyConnection(relation);
        assertEquals(0, victim.getFamilyConnections().size());
    }

    @Test
    public void testAddMedicalRecord() {
        Location location = new Location("John", "Canada");
        MedicalRecord record = new MedicalRecord(location, "Broken leg", "2024-03-12");
        victim.addMedicalRecord(record);
        assertEquals(1, victim.getMedicalRecords().length);
        assertEquals("Broken leg", victim.getMedicalRecords()[0].getTreatmentDetails());
        assertEquals("2024-03-12", victim.getMedicalRecords()[0].getDateOfTreatment());
    }

    @Test
    public void testSetAndGetSupply() {
        victim.setSupply("Water");
        assertEquals("Water", victim.getSupply());
    }

    @Test
    public void testSetAndGetAge() {
        victim.setAge(35);
        assertEquals("35", victim.getAge());
    }

    @Test
    public void testSetAndGetDateOfBirth() {
        victim.setDateOfBirth("1994-01-01");
        assertEquals("1994-01-01", victim.getDateOfBirth());
    }

    @Test
    public void testSetAndGetFirstName() {
        victim.setFirstName("Jack");
        assertEquals("Jack", victim.getFirstName());
    }

    @Test
    public void testSetAndGetLastName() {
        victim.setLastName("Doe");
        assertEquals("Doe", victim.getLastName());
    }

    @Test
    public void testDietRestriction() {
        // Test each diet restriction case
        victim.dietRestriction(DisasterVictim.Diet.AVML);
        // Assert based on expected behavior (e.g., using the output)
    }

    @Test
    public void testDecreaseSupplyQuantity() {
        ArrayList<Supply> supplies = new ArrayList<>();
        supplies.add(new Supply("Water", 10));
        victim.setPersonalBelongings(supplies);

        Supply waterSupply = new Supply("Water", 5);
        victim.decreaseSupplyQuantity(waterSupply);

        assertEquals(5, victim.getPersonalBelongings().get(0).getQuantity());
    }
}
