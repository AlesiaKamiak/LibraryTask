package by.htp.library.entity;

public class Author {

	private String name;
	private String surname;
	private String patronymic;
	private int yearBirtday;

	public Author() {

	}

	public Author(String name, String surname, String patronymic, int yearBirtday) {
		super();
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		this.yearBirtday = yearBirtday;
	}

	public String toString() {
		return "(" + name + " " + surname + " " + patronymic + ")";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public int getYearBirtday() {
		return yearBirtday;
	}

	public void setYearBirtday(int yearBirtday) {
		this.yearBirtday = yearBirtday;
	}

}
