package org.example;

/**
 * Тестовый класс для демонстрации аннотаций
 */
@DeprecatedEx(message = "Используйте NewTestClass вместо этого")
public class TestClass {
    
    @JsonField(name = "userName")
    private String name;
    
    @JsonField(name = "userAge")
    private int age;
    
    private String email; // Поле без аннотации
    
    public TestClass(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
    
    @DeprecatedEx(message = "Используйте getNewName() вместо этого")
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
} 