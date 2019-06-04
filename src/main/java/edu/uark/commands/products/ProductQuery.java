package edu.uark.commands.products;

import java.util.UUID;

import edu.uark.commands.ResultCommandInterface;
import edu.uark.models.api.Product;
import edu.uark.models.repositories.ProductRepository;
import edu.uark.models.repositories.interfaces.ProductRepositoryInterface;

public class ProductQuery implements ResultCommandInterface<Product> {

	public ProductQuery( ) {
		this.productRepository = new ProductRepository();
	}
	
	@Override
	public Product execute( ) {
		return new Product(this.productRepository.get(this.productId));
	}

	// Properties
	private UUID productId;
	public UUID getProductId( ) {
		return this.productId;
	}
	public ProductQuery setProductId(UUID productId) {
		this.productId = productId;
		return this;
	}

	private ProductRepositoryInterface productRepository;
	public ProductRepositoryInterface getProductRepository( ) {
		return this.productRepository;
	}
	public ProductQuery setProductRepository(ProductRepositoryInterface productRepository) {
		this.productRepository = productRepository;
		return this;
	}
}