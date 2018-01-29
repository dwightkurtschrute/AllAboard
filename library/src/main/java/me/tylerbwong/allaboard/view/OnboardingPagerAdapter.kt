package me.tylerbwong.allaboard.view

import android.support.v4.view.PagerAdapter
import android.view.View
import android.view.ViewGroup

class OnboardingPagerAdapter(private val pages: List<Page>) : PagerAdapter() {
    override fun instantiateItem(container: ViewGroup, position: Int): View =
        pages[position].getView(container.context, container).also { container.addView(it) }

    override fun destroyItem(container: ViewGroup, position: Int, page: Any) {
        container.removeView(page as View)
    }

    override fun getCount(): Int = pages.size

    override fun isViewFromObject(view: View, page: Any): Boolean = view === page
}