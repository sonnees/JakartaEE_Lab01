package vn.edu.iuh.fit.BackEnd.services;

import jakarta.inject.Inject;
import vn.edu.iuh.fit.BackEnd.models.Product;
import vn.edu.iuh.fit.BackEnd.models.ProductImage;
import vn.edu.iuh.fit.BackEnd.repositories.ProductDao;
import vn.edu.iuh.fit.BackEnd.repositories.ProductImageDao;

import java.util.List;

public class ProductImageSer {
    @Inject
    private ProductImageDao dao;

    @Inject
    public ProductImageSer(ProductImageDao productImageDao) {
        this.dao = productImageDao;
    }

    public List<ProductImage> getAll(){
        return dao.getAll();
    }

    public ProductImage searchById(long id){
        return dao.searchById(id);
    }

    public boolean add(ProductImage productImage){
        return dao.add(productImage);
    }

    public boolean updateField(long id, String nameField, String newValue){
        return dao.updateField(id,nameField,newValue);
    }
    public boolean del(long id){
        return dao.del(id);
    }

}