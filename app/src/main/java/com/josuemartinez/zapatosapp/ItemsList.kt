package com.josuemartinez.zapatosapp

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.josuemartinez.zapatosapp.databinding.ListItemsBinding
import com.josuemartinez.zapatosapp.models.Shoe


class ItemsList: LinearLayout {

    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    private val bindingList = ListItemsBinding.inflate(
        LayoutInflater.from(context),
        this,
        false)


    fun filledShoe(shoe: Shoe) {
        bindingList.apply {
            addView(this.root)
            textShoeName.text = shoe.name
            textShoeCompany.text = shoe.company
            textShoeSize.text = shoe.size.toString()
            textShoeDescription.text = shoe.description
        }
    }



}