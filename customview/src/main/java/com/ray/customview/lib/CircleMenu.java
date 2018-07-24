package com.ray.customview.lib;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import java.util.List;

/**
 * @ Created by Raymond on 2018/6/25 20:32
 */
public class CircleMenu extends View {
    private static final int MEUN_STATUS_OPEN = 1;
    private static final int MEUN_STATUS_OPENED = 1 << 1;
    private static final int MEUN_STATUS_CLOSE = 1 << 2;
    private static final int MEUN_STATUS_CLOSE_CLEAR = 1 << 3;
    private static final int MEUN_STATUS_CLOSED = 1 << 4;
    private static final int MEUN_STATUS_CANCEL = 1 << 5;
    private static final int MENU_SUBMENU_NUM = 8;

    private int status;

    private Paint oPaint;
    private Paint cPaint;
    private Paint sPaint;

    private Path path, desPath;
    //PathMeasure用来测量关联的path，获取该path相关状态
    private PathMeasure pathMeasure;

    private int mainMenuColor;

    private Drawable openMenuIcon;

    private Drawable closeMenuIcon;

    private List<Integer> subMenuColorLsit;

    private List<Drawable> subMenuDrawableList;

    public CircleMenu(Context context) {
        super(context);
    }

    public CircleMenu(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CircleMenu(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        //status = MEUN_STATUS_CLOSED;
        init();
    }

    //初始化画图工具
    private void initTools() {
        oPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        oPaint.setStyle(Paint.Style.FILL_AND_STROKE);

        cPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        cPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        cPaint.setStrokeCap(Paint.Cap.ROUND);

        sPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        sPaint.setStyle(Paint.Style.FILL);

        path = new Path();
        desPath = new Path();
        //无参构造
        pathMeasure = new PathMeasure();
    }

    private void init() {
        initTools();

        openMenuIcon = new GradientDrawable();

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    /**
     * 绘制周围子菜单环绕的圆环路径
     *
     * @param canvas
     */
    private void drawCirclePatch(Canvas canvas) {
        if (status == MEUN_STATUS_CLOSE) {

        }
    }

    /**
     * 绘制子菜单转动时的图标
     *
     * @param canvas
     */
    private void drawCircleIcon(Canvas canvas) {

    }

    /**
     * 绘制子菜单转动时的轨迹路径
     *
     * @param canvas
     */
    private void drawCirclePath(Canvas canvas) {

    }

    /**
     * 绘制子菜单按钮
     *
     * @param canvas
     */
    private void drawSubMenu(Canvas canvas) {

    }

    /**
     * 绘制子菜单图标
     *
     * @param canvas
     */
    private void drawSubmenuIcon(Canvas canvas) {

    }

    /**
     * 绘制中间开关按钮
     *
     * @param canvas
     */
    private void drawMainMenu(Canvas canvas) {

    }

    /**
     * 绘制中间按钮图标
     *
     * @param canvas
     */
    private void drawMainMenuIcon(Canvas canvas) {

    }

    /**
     * 绘制按钮阴影
     * @param canvas
     * @param centerX
     * @param centerY
     * @param radius
     */
    private void drawMenuShadow(Canvas canvas, int centerX, int centerY, float radius) {

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    /**
     * 更新按钮状态
     * @param menuIndex
     * @param isPress
     */
    private void updatePressEffect(int menuIndex, boolean isPress){

    }

    /**
     * 按钮按下时颜色
     * @param menuIndex
     * @param depth
     * @return
     */
    private int calcPressEffectColor(int menuIndex, float depth){
        return 0;
    }

    /**
     * 动画透明度
     * @param color
     * @param reverse
     * @return
     */
    private int calcAlphaColor(int color, boolean reverse){
        return 0;
    }

}