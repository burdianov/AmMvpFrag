package com.testography.am_mvp.data.managers;

import android.content.Context;

import com.testography.am_mvp.data.storage.dto.ProductDto;
import com.testography.am_mvp.utils.ConstantsManager;

import java.util.ArrayList;
import java.util.List;

public class DataManager {
    private static DataManager ourInstance;
    private List<ProductDto> mMockProductList;

    private PreferencesManager mPreferencesManager;
    private Context mAppContext;

    private DataManager() {
        mPreferencesManager = new PreferencesManager();
        mAppContext = AmMvpApplication.getAppContext();

        generateMockData();
    }

    public static DataManager getInstance() {
        if (ourInstance == null) {
            ourInstance = new DataManager();
        }
        return ourInstance;
    }

    public PreferencesManager getPreferencesManager() {
        return mPreferencesManager;
    }

    public Context getAppContext() {
        return mAppContext;
    }

    public boolean isAuthUser() {
        return !mPreferencesManager.getAuthToken().equals(ConstantsManager
                .INVALID_TOKEN);
    }

    public void loginUser(String email, String password) {
        // TODO: 23-Oct-16 implement user authentication
    }

    public ProductDto getProductById(int productId) {
        // TODO: 28-Oct-16 gets product from mock (to be converted to DB)
        return mMockProductList.get(productId - 1);
    }

    public List<ProductDto> getProductList() {
        // TODO: 28-Oct-16 get product list
        return mMockProductList;
    }

    public void updateProduct(ProductDto product) {
        // TODO: 28-Oct-16 update product count or other property and save to DB
    }

    private void generateMockData() {
        mMockProductList = new ArrayList<>();
        mMockProductList.add(new ProductDto(1, "test 1", "imageUrl", "description" +
                " 1 description 1 description 1 description 1 description 1", 100,
                1));
        mMockProductList.add(new ProductDto(2, "test 2", "imageUrl", "description" +
                " 1 description 1 description 1 description 1 description 1", 200,
                1));
        mMockProductList.add(new ProductDto(3, "test 3", "imageUrl", "description" +
                " 1 description 1 description 1 description 1 description 1", 300,
                1));
        mMockProductList.add(new ProductDto(4, "test 4", "imageUrl", "description" +
                " 1 description 1 description 1 description 1 description 1", 400,
                1));
        mMockProductList.add(new ProductDto(5, "test 5", "imageUrl", "description" +
                " 1 description 1 description 1 description 1 description 1", 500,
                1));
        mMockProductList.add(new ProductDto(6, "test 6", "imageUrl", "description" +
                " 1 description 1 description 1 description 1 description 1", 600,
                1));
        mMockProductList.add(new ProductDto(7, "test 7", "imageUrl", "description" +
                " 1 description 1 description 1 description 1 description 1", 700,
                1));
        mMockProductList.add(new ProductDto(8, "test 8", "imageUrl", "description" +
                " 1 description 1 description 1 description 1 description 1", 800,
                1));
        mMockProductList.add(new ProductDto(9, "test 9", "imageUrl", "description" +
                " 1 description 1 description 1 description 1 description 1", 900,
                1));
        mMockProductList.add(new ProductDto(10, "test 10", "imageUrl",
                "description " +
                        "1 description 1 description 1 description 1 description 1", 1000,
                1));
    }
}
