package za.ac.cput.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Cart;
import za.ac.cput.repository.CartRepository;

import java.util.List;

@Service
public class CartService implements ICartService {
    private CartRepository cartRepository;

    @Autowired
    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    @Override
    public Cart save(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public Cart read(Long cartId) {
        return cartRepository.findById(cartId).orElse(null);
    }

    @Override
    public Cart update(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public void delete(Long cartId) {
        cartRepository.deleteById(cartId);
    }

    @Override
    public List<Cart> getall() {
        return cartRepository.findAll();
    }
}
