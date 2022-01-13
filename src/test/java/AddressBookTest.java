import com.biz.addressbook.PersonContact;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class AddressBookTest {

    @Test
    public void givenContact_whenAddlingList_shouldReturnsData() {

        List<PersonContact> personContactList=new ArrayList();
        PersonContact personContact=new PersonContact("Rahul","Sharma","Pune","Pune","Maharashtra",111222,987698754,"Rahul@gmail.com");
        personContactList.add(personContact);

        PersonContact expectedResult=personContactList.get(0);

        Assert.assertEquals(personContact,expectedResult);

    }
}
