public class Person {
 private String name;
 private String title;
 private String address;

 public Person() {
 }
 public Person(String name) {
 this.name = name;
 }
 public String getName() {
 return name;
 }
 public void setName(String name) {
 this.name = name;
 }
 public String getTitle() {
 return title;
 }
 public void setTitle(String title) {
 this.title = title;
 }
 public String getAddress() {
 return address;
 }
 public void setAddress(String address) {
 this.address = address;

 }
 public String getNameWithTitle() {
 String nameTitle;
 if (title != null) {
 nameTitle = name + ", " + title;
 } else {
 nameTitle = name;
 }
 return nameTitle;
 }
 @Override
 public String toString() {
 return "Info ["/* +
 "name='" + name + '/'' +
 ", title='" + title + ''' +
 ", address='" + address + ''' +
 ']'*/;
 }
}
