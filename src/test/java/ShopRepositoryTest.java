import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.NotFoundException;
import ru.netology.Product;
import ru.netology.ShopRepository;

public class ShopRepositoryTest {
    @Test
    public void findIdTest() {
        Product product1 = new Product(32,"Whiskey",20);
        Product product2 = new Product(43, "Vodka",17);
        Product product3 = new Product(57, "Rum", 13);
ShopRepository repo = new ShopRepository();
repo.add(product1);
repo.add(product2);
repo.add(product3);
Product expected = product2;
Product actual = repo.findById(43);
        Assertions.assertEquals(expected, actual);
    }
  @Test
    public void removeTestIfException() {
      Product product1 = new Product(32,"Whiskey",20);
      Product product2 = new Product(43, "Vodka",17);
      Product product3 = new Product(57, "Rum", 13);
      ShopRepository repo = new ShopRepository();
      repo.add(product1);
      repo.add(product2);
      repo.add(product3);
      Assertions.assertThrows(NotFoundException.class,() -> {
          repo.remove(67);
      } );
  }
  @Test
    public void removeIfIdExists() {
      Product product1 = new Product(32,"Whiskey",20);
      Product product2 = new Product(43, "Vodka",17);
      Product product3 = new Product(57, "Rum", 13);
      ShopRepository repo = new ShopRepository();
      repo.add(product1);
      repo.add(product2);
      repo.add(product3);
      repo.remove(57);
      Product[] expected = {product1, product2};
      Product[] actual = repo.findAll();
      Assertions.assertArrayEquals(expected, actual);
  }

}
