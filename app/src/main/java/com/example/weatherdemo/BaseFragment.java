package com.example.weatherdemo;

import androidx.fragment.app.Fragment;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

/*xutils加载数据过程
 * 1.声明整体模块，自定义UniteApp进行声明并加载到AndroidManifest中的application
 * 2.执行网络请求操作*/
public class BaseFragment extends Fragment implements Callback.CommonCallback<String> {
    public void loadData(String path) {
        RequestParams params = new RequestParams(path);//请求数据路径
        x.http().get(params, this);
    }

    /*获取数据成功时回调的接口*/
    @Override
    public void onSuccess(String result) {

    }

    /*获取数据失败时回调的接口*/
    @Override
    public void onError(Throwable ex, boolean isOnCallback) {

    }

    /*取消获取数据时回调的接口*/
    @Override
    public void onCancelled(CancelledException cex) {

    }

    /*完成获取数据时回调的接口*/
    @Override
    public void onFinished() {

    }
}
