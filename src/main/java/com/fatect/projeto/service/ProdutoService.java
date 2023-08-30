import com.fatect.projeto.Produto;
import com.fatect.projeto.model.ProdutoRepository;
import com.fatect.projeto.service.IProdutoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProdutoService implements IProdutoService {
    @Autowired
    ProdutoRepository repository;

    @Override
    public List<Produto> consultaCatalago(){
       return repository.findAll();
    }
}