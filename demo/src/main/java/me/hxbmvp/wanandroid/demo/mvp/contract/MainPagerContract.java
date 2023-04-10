package me.hxbmvp.wanandroid.demo.mvp.contract;

import android.app.Activity;
import android.content.Context;

import com.jess.arms.mvp.IModel;
import com.jess.arms.mvp.IView;

import io.reactivex.Observable;
import me.hxbmvp.wanandroid.demo.mvp.model.entity.BaseResponse;
import me.hxbmvp.wanandroid.demo.mvp.model.entity.FeedArticleListData;


/**
 * @作者：hexingbo
 * @时间：04/10/2023
 * @描述：
 */
public interface MainPagerContract {
    //对于经常使用的关于UI的方法可以定义到IView中,如显示隐藏进度条,和显示文字消息
    interface View extends IView {

        void initRefreshView();

        void startLoadMore();

        void endLoadMore();

        Activity getActivity();
    }

    //Model层定义接口,外部只需关心Model返回的数据,无需关心内部细节,即是否使用缓存
    interface Model extends IModel {
        Observable<BaseResponse<FeedArticleListData>> getMainPagers(int page);
    }
}
