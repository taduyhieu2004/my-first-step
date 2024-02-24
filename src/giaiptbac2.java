import java.util.Scanner;

public class giaiptbac2 {
  private static int input() {

    Scanner sc = new Scanner(System.in);
    return sc.nextInt();

  }


  private static int handleDelta(int a, int b, int c) {
    int delta = b * b - 4 * a * c;
    return delta;
  }

  private static void output(int a, int b, int c, int delta) {
    if (a == 0) {

      if (b == 0 && c == 0) {
        System.out.println("phương trình vô số nghiệm ");
      } else if (b == 0 && c != 0) {
        System.out.println("phương trình vô nghiệm");
      } else {
        System.out.println("phương trình có 1 nghiệm x=" + (-c / b));
      }

    } else {

      if (delta < 0) {

        System.out.println("phương trình vô nghiệm");

      } else if (delta == 0) {

        double x1 = (-b / (2 * a));
        System.out.println("phương trình có nghiệm kép" + x1);

      } else {

        double x1 = ((-b - Math.sqrt(delta)) / (2 * a));
        double x2 = ((-b + Math.sqrt(delta)) / (2 * a));
        System.out.println("phương trình có hai nghiệm phân biệt :" + "x1=" + x1 + "và x2=" + x2);

      }

    }
  }

  public static void main(String[] args) {
    int a, b, c, delta;

    System.out.println("Nhap gia tri a");
    a = input();

    System.out.println("Nhập giá trị cua b ");
    b = input();

    System.out.println("Nhập giá trị cua c");
    c = input();

    delta = handleDelta(a, b, c);

    output(a, b, c, delta);
  }
}



//@Service
//@Slf4j
//public class CategoryServiceImpl extends BaseServiceImpl<Category> implements CategoryService {
//  private final CategoryRepository repository;
//
//  public CategoryServiceImpl(CategoryRepository repository) {
//    super(repository);
//    this.repository = repository;
//  }
//
//  @Override
//  public boolean isExist(String id) {
//    return repository.existsById(id);
//  }
//
//  @Override
//  public boolean existName(String name) {
//    return repository.existsByName(name);
//  }
//
//  @Override
//  public CategoryResponse create(CategoryRequest request) {
//    log.info("(create) request: {}", request);
//    if (existName(request.getName())) {
//      throw new NameAlreadyExist();
//    }
//    Category category = MODEL_MAPPER.map(request, Category.class);
//    return MODEL_MAPPER.map(create(category), CategoryResponse.class);
//
//  }
//  public static class MessageSuccess {
//    public static final String CREATE_CATEGORY_SUCCESSFULLY = "Create Category Successfully";
//    public static final String LIST_ALL_SUCCESSFULLY = "List all Category Successfully";
//
//    public static final String DELETE_CATEGORY_SUCCESSFULLY = "Delete Category Successfully";
//
//    public static final String UPDATE_CATEGORY_SUCCESSFULLY = "Update Category Successfully";
//
//    public static final String GET_CATEGORY_BY_ID_SUCCESSFULLY = "Get Category Successfully";
//
//
//  }
//  @Data
//  @Entity
//  @Table(name = "category")
//  public class Category extends BaseEntityWithUpdater {
//    private String name;
//    private String urlImage;
//  }
//
//
//  public interface CategoryRepository extends BaseRepository<Category> {
//    boolean existsByName(String name);
//  }
//
//
//  public interface CategoryService extends BaseService<Category> {
//    boolean isExist(String id);
//
//    boolean existName(String name);
//
//    CategoryResponse create(CategoryRequest request);
//  }
//
//
//  @RestController
//  @RequestMapping("/api/v1/categories")
//  @Slf4j
//  public class CategoryController {
//    private final CategoryService categoryService;
//
//    public CategoryController(CategoryService categoryService) {
//      this.categoryService = categoryService;
//    }
//
//    @PostMapping("/create")
//    public ResponseGeneral<CategoryResponse> create(@RequestBody CategoryRequest request) {
//      log.info("(create)request: {}", request);
//      return ResponseGeneral.of(HttpStatus.CREATED.value(),
//            CREATE_CATEGORY_SUCCESSFULLY, categoryService.create(request));
//    }
//  }
//
//  public static final ModelMapper MODEL_MAPPER = new ModelMapper();
//
//
//}
