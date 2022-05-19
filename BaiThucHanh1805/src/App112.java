
    System.out.println("---Danh sach sinh vien phai thi lai---");
    for(int i=0; i<listStudent.size();i ++){
      if(listStudent.get(i).getPoint() <= 5){
        System.out.println("Sinh vien: " + (i+1));
        listStudent.get(i).displayStudent();
      }
    }

    System.out.println("---Danh sach sinh vien co diem cao nhat---");
    int max = listStudent.get(0).getPoint();    
    for (int i = 1; i < listStudent.size(); i++) {
        if (listStudent.get(i).getPoint() > max) {
            max = listStudent.get(i).getPoint();
        }
    }
    for(int i=0; i< listStudent.size(); i++){
        if(listStudent.get(i).getPoint() == max){
          listStudent.get(i).displayStudent();
        }
    }

    String  nameForSearch;
    System.out.println("Nhap ten sinh vien can tim");
    nameForSearch = scanner.nextLine();
    for(int i = 0; i<listStudent.size(); i++){
      if(listStudent.get(i).getName().equals(nameForSearch)){
        listStudent.get(i).displayStudent();
      }
    }
  }
}
class Student {
  Scanner scanner = new Scanner(System.in);
  private String name;
  private int point;
  public Student(){};
  public Student(String name, int point) {
      super();
      this.name = name;
      this.point = point;
  }
  public String getName() {
      return name;
  }
  public void setName(String name) {
      this.name = name;
  }
  public int getPoint() {
      return point;
  }
  public void setPoint(int point) {
      this.point = point;
  }
  public void displayStudent(){
    System.out.println("Name: " + name);
    System.out.println("Point: " + point);
  }
  @Override
  public String toString() {
      return "Student@[name=" + name + ", point=" + point + "]";
  }
}