package com.dialog.using.kotlin

import android.app.Activity
import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.DialogInterface
import android.graphics.Color
import android.graphics.Rect
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import java.util.*

class ShowAlertDialogActivity : AppCompatActivity() {

    companion object {
        private val TAG: String = ShowAlertDialogActivity::class.java.simpleName
    }

    private lateinit var showDialogMaterialButton: MaterialButton

    private lateinit var itemsList: Array<String>
    private lateinit var checkedItems: BooleanArray
    private lateinit var selectedItems: ArrayList<Int>

    private var singleCheckedItem = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_alert_dialog)
        title = "Alert Dialog"

        initializeView()
        initializeObject()
        setOnClickListener()
    }

    protected fun initializeView() {
        showDialogMaterialButton = findViewById(R.id.showDialogMaterialButton)
    }

    protected fun initializeObject() {
        itemsList = resources.getStringArray(R.array.shopping_item)
        checkedItems = BooleanArray(itemsList.size)
        selectedItems = ArrayList()
    }

    protected fun setOnClickListener() {
        showDialogMaterialButton.setOnClickListener {
            alertDialog(this)
        }
    }

    public fun alertDialog(activity: Activity) {
        val alertDialogBuilder = AlertDialog.Builder(activity)

        alertDialogBuilder.setIcon(R.drawable.ic_android)
        alertDialogBuilder.setTitle("Title")
        alertDialogBuilder.setMessage("Message")

        alertDialogBuilder.setNeutralButton("Neutral", object : DialogInterface.OnClickListener {
            override fun onClick(dialog: DialogInterface?, which: Int) {
                dialog!!.cancel()
                Toast.makeText(
                    applicationContext,
                    "You clicked on Neutral Button",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })

        alertDialogBuilder.setNegativeButton("Negative", object : DialogInterface.OnClickListener {
            override fun onClick(dialog: DialogInterface?, which: Int) {
                dialog!!.cancel()
                Toast.makeText(
                    applicationContext,
                    "You clicked on Negative Button",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })

        alertDialogBuilder.setPositiveButton("Positive", object : DialogInterface.OnClickListener {
            override fun onClick(dialog: DialogInterface?, which: Int) {
                dialog!!.cancel()
                Toast.makeText(
                    applicationContext,
                    "You clicked on Positive Button",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })

        val alertDialog = alertDialogBuilder.create()
        alertDialog.setCancelable(false)
        alertDialog.setCanceledOnTouchOutside(false)
        alertDialog.show()
    }

    public fun alertDialogRemoveSomeCodeOne(activity: Activity) {
        val alertDialogBuilder = AlertDialog.Builder(activity)

        alertDialogBuilder.setIcon(R.drawable.ic_android)
        alertDialogBuilder.setTitle("Title")
        alertDialogBuilder.setMessage("Message")

        alertDialogBuilder.setNeutralButton("Neutral") { dialogInterface, which ->
            dialogInterface.dismiss()
            Toast.makeText(
                applicationContext,
                "You clicked on Neutral Button",
                Toast.LENGTH_SHORT
            ).show()
        }

        alertDialogBuilder.setNegativeButton("Negative") { dialogInterface, which ->
            dialogInterface.dismiss()
            Toast.makeText(
                applicationContext,
                "You clicked on Negative Button",
                Toast.LENGTH_SHORT
            ).show()
        }

        alertDialogBuilder.setPositiveButton("Positive") { dialogInterface, which ->
            dialogInterface.dismiss()
            Toast.makeText(
                applicationContext,
                "You clicked on Positive Button",
                Toast.LENGTH_SHORT
            ).show()
        }

        val alertDialog = alertDialogBuilder.create()
        alertDialog.setCancelable(false)
        alertDialog.setCanceledOnTouchOutside(false)
        alertDialog.show()
    }

    public fun alertDialogRemoveSomeCodeTwo(activity: Activity) {
        AlertDialog.Builder(activity)
            .setIcon(R.drawable.ic_android)
            .setTitle("Title")
            .setMessage("Message")
            .setNeutralButton("Neutral", DialogInterface.OnClickListener { dialogInterface, which ->
                Toast.makeText(
                    applicationContext,
                    "You clicked on Neutral Button",
                    Toast.LENGTH_SHORT
                ).show()
            })
            .setNegativeButton(
                "Negative",
                DialogInterface.OnClickListener { dialogInterface, which ->
                    Toast.makeText(
                        applicationContext,
                        "You clicked on Negative Button",
                        Toast.LENGTH_SHORT
                    ).show()
                })
            .setPositiveButton(
                "Positive",
                DialogInterface.OnClickListener { dialogInterface, which ->
                    Toast.makeText(
                        applicationContext,
                        "You clicked on Positive Button",
                        Toast.LENGTH_SHORT
                    ).show()
                })
            .setCancelable(false)
            .create()
            .show()
    }

    public fun alertDialogRemoveSomeCodeThree(activity: Activity)  {
        val builder = AlertDialog.Builder(activity)

        with(builder) {
            setIcon(R.drawable.ic_android)
            setTitle("Title")
            setMessage("Message")
            setNeutralButton("Neutral", DialogInterface.OnClickListener { dialogInterface, which ->
                Toast.makeText(
                    applicationContext,
                    "You clicked on Neutral Button",
                    Toast.LENGTH_SHORT
                ).show()
            })
            setNegativeButton(
                "Negative",
                DialogInterface.OnClickListener { dialogInterface, which ->
                    Toast.makeText(
                        applicationContext,
                        "You clicked on Negative Button",
                        Toast.LENGTH_SHORT
                    ).show()
                })
            setPositiveButton(
                "Positive",
                DialogInterface.OnClickListener { dialogInterface, which ->
                    Toast.makeText(
                        applicationContext,
                        "You clicked on Positive Button",
                        Toast.LENGTH_SHORT
                    ).show()
                })
            setCancelable(false)
            create()
            show()
        }
    }

    public fun alertDialogTwo(activity: Activity) {
        val alertDialogBuilder = AlertDialog.Builder(activity)

        alertDialogBuilder.setIcon(R.drawable.ic_android)
        alertDialogBuilder.setTitle("Title")
        alertDialogBuilder.setMessage("Message")

        alertDialogBuilder.setNeutralButton(
            "Neutral"
        ) { dialog, which ->
            dialog.cancel()
            Toast.makeText(
                applicationContext,
                "You clicked on Neutral Button", Toast.LENGTH_SHORT
            )
                .show()
        }

        alertDialogBuilder.setNegativeButton(
            "Negative"
        ) { dialog, which ->
            dialog.cancel()
            Toast.makeText(
                applicationContext,
                "You clicked on Negative Button", Toast.LENGTH_SHORT
            )
                .show()
        }

        alertDialogBuilder.setPositiveButton(
            "Positive"
        ) { dialog, which ->
            dialog.cancel()
            Toast.makeText(
                applicationContext,
                "You clicked on Positive Button", Toast.LENGTH_SHORT
            )
                .show()
        }

        val alertDialog = alertDialogBuilder.create()
        alertDialog.setCancelable(false)
        alertDialog.setCanceledOnTouchOutside(false)
        alertDialog.show()

        val positiveButton: Button = alertDialog.getButton(AlertDialog.BUTTON_POSITIVE)
        val negativeButton: Button = alertDialog.getButton(AlertDialog.BUTTON_NEGATIVE)
        val neutralButton: Button = alertDialog.getButton(AlertDialog.BUTTON_NEUTRAL)

        positiveButton.setTextColor(Color.parseColor("#FF0B8B42"))
        positiveButton.setBackgroundColor(Color.parseColor("#FFE1FCEA"))

        negativeButton.setTextColor(Color.parseColor("#FFFF0400"))
        negativeButton.setBackgroundColor(Color.parseColor("#FFFCB9B7"))

        neutralButton.setTextColor(Color.parseColor("#FF1B5AAC"))
        neutralButton.setBackgroundColor(Color.parseColor("#FFD9E9FF"))

        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )

        params.setMargins(20, 0, 0, 0)
        positiveButton.setLayoutParams(params)
    }

    public fun exitAlertDialog(activity: Activity) {
        val alertDialogBuilder = AlertDialog.Builder(activity)

        alertDialogBuilder.setIcon(R.drawable.ic_question_mark)
        alertDialogBuilder.setTitle("Confirm Exit")
        alertDialogBuilder.setMessage("Are you sure you want to exit?")

        alertDialogBuilder.setNegativeButton(
            "No"
        ) { dialog, which -> dialog.cancel() }

        alertDialogBuilder.setPositiveButton(
            "Yes"
        ) { dialog, which -> dialog.cancel() }

        val alertDialog = alertDialogBuilder.create()
        alertDialog.setCancelable(false)
        alertDialog.setCanceledOnTouchOutside(false)
        alertDialog.show()
    }

    public fun customAlertDialogOne(activity: Activity) {
        val customAlertDialogLayout: View = layoutInflater.inflate(
            R.layout.custom_alert_dialog_one,
            null
        )

        val emailTextInputLayout: TextInputLayout = customAlertDialogLayout.findViewById(R.id.emailTextInputLayout)
        val emailTextInputEditText: TextInputEditText = customAlertDialogLayout.findViewById(R.id.emailTextInputEditText)

        val passwordTextInputLayout: TextInputLayout = customAlertDialogLayout.findViewById(R.id.passwordTextInputLayout)
        val passwordTextInputEditText: TextInputEditText = customAlertDialogLayout.findViewById(R.id.passwordTextInputEditText)

        val alertDialogBuilder = AlertDialog.Builder(activity)
        alertDialogBuilder.setView(customAlertDialogLayout)

        alertDialogBuilder.setIcon(R.drawable.ic_account)
        alertDialogBuilder.setTitle("Sing In")

        alertDialogBuilder.setNegativeButton("DONE", object : DialogInterface.OnClickListener {
            override fun onClick(dialog: DialogInterface?, which: Int) {
                dialog!!.cancel()
            }
        })

        alertDialogBuilder.setPositiveButton("CANCEL", object : DialogInterface.OnClickListener {
            override fun onClick(dialog: DialogInterface?, which: Int) {
                dialog!!.cancel()
            }
        })

        val alertDialog = alertDialogBuilder.create()
        alertDialog.setCancelable(false)
        alertDialog.setCanceledOnTouchOutside(false)
        alertDialog.show()

        val displayRectangle = Rect()
        val window: Window = this.window

        window.decorView.getWindowVisibleDisplayFrame(displayRectangle)

        alertDialog.window!!.setGravity(Gravity.CENTER)
        alertDialog.window!!.setBackgroundDrawable(ColorDrawable(Color.WHITE))
    }

    public fun customAlertDialogTwo(activity: Activity) {
        val customAlertDialogLayout: View = layoutInflater.inflate(
            R.layout.custom_alert_dialog_two,
            null
        )

        val signInHeadingTextView: TextView = customAlertDialogLayout.findViewById(R.id.signInHeadingTextView)

        val emailTextInputLayout: TextInputLayout = customAlertDialogLayout.findViewById(R.id.emailTextInputLayout)
        val emailTextInputEditText: TextInputEditText = customAlertDialogLayout.findViewById(R.id.emailTextInputEditText)

        val passwordTextInputLayout: TextInputLayout = customAlertDialogLayout.findViewById(R.id.passwordTextInputLayout)
        val passwordTextInputEditText: TextInputEditText = customAlertDialogLayout.findViewById(R.id.passwordTextInputEditText)

        val signInMaterialButton: MaterialButton = customAlertDialogLayout.findViewById(R.id.signInMaterialButton)
        val signUpLinkMaterialButton: MaterialButton = customAlertDialogLayout.findViewById(R.id.signUpLinkMaterialButton)

        val alertDialogBuilder = AlertDialog.Builder(activity)
        alertDialogBuilder.setView(customAlertDialogLayout)

        val alertDialog = alertDialogBuilder.create()
        alertDialog.setCancelable(false)
        alertDialog.setCanceledOnTouchOutside(false)
        alertDialog.show()

        val displayRectangle = Rect()
        val window: Window = this.window

        window.decorView.getWindowVisibleDisplayFrame(displayRectangle)

        alertDialog.window!!.setGravity(Gravity.CENTER)
        alertDialog.window!!.setBackgroundDrawable(ColorDrawable(Color.WHITE))

        signInMaterialButton.setOnClickListener {  alertDialog.cancel() }
        signUpLinkMaterialButton.setOnClickListener { alertDialog.cancel() }
    }

    public fun customAlertDialogTesting(activity: Activity) {
        val inflater = layoutInflater
        val customAlertDialogLayout: View =
            inflater.inflate(R.layout.test_custom_alert_dialog, null)

        val alertDialogBuilder = AlertDialog.Builder(activity)
        alertDialogBuilder.setView(customAlertDialogLayout)
        alertDialogBuilder.setCancelable(false)
        val alertDialog = alertDialogBuilder.create()
        alertDialog.show()
    }

    public fun singleChoiceAlertDialog(activity: Activity) {
        val stringArray = resources.getStringArray(R.array.languages)

        val alertDialogBuilder = AlertDialog.Builder(activity)

        alertDialogBuilder.setTitle("Select Language")

        alertDialogBuilder.setItems(
            stringArray
        ) { dialogInterface, indexPosition ->
            val selectedItem: Array<out String>? = Arrays.asList(stringArray)[indexPosition]
            Toast.makeText(
                applicationContext,
                "Selected Language: $selectedItem",
                Toast.LENGTH_LONG
            ).show()
        }

        val alertDialog = alertDialogBuilder.create()
        alertDialog.setCancelable(false)
        alertDialog.setCanceledOnTouchOutside(false)
        alertDialog.show()
    }

    public fun setSingleChoiceAlertDialog(activity: Activity) {
        val stringArray = arrayOf("Rohit", "Abhishek", "Jatinder", "Shiva", "Rama")

        val alertDialogBuilder = AlertDialog.Builder(activity)

        alertDialogBuilder.setTitle("Select Name")

        alertDialogBuilder.setSingleChoiceItems(
            stringArray, singleCheckedItem
        ) { dialogInterface, indexPosition ->
            singleCheckedItem = indexPosition
            val selectedItem: Array<String>? = Arrays.asList(stringArray)[singleCheckedItem]
            Toast.makeText(
                applicationContext,
                "Selected Language: $selectedItem",
                Toast.LENGTH_LONG
            ).show()
        }

        alertDialogBuilder.setNeutralButton(
            "Clear all"
        ) { dialogInterface, which -> singleCheckedItem = 0 }

        alertDialogBuilder.setNegativeButton(
            "Dismiss"
        ) { dialogInterface, i -> dialogInterface.dismiss() }

        val alertDialog = alertDialogBuilder.create()
        alertDialog.setCancelable(false)
        alertDialog.setCanceledOnTouchOutside(false)
        alertDialog.show()
    }

    public fun multiChoiceAlertDialog(activity: Activity) {
        /* final String[] itemsList = getResources().getStringArray(R.array.shopping_item);
        final boolean[] checkedItems = new boolean[itemsList.length];
        final ArrayList<Integer> selectedItems = new ArrayList<>();*/

        /* final String[] itemsList = getResources().getStringArray(R.array.shopping_item);
        final boolean[] checkedItems = new boolean[itemsList.length];
        final ArrayList<Integer> selectedItems = new ArrayList<>();*/
        val alertDialogBuilder = AlertDialog.Builder(activity)

        alertDialogBuilder.setTitle("Select Item")
        alertDialogBuilder.setMultiChoiceItems(
            itemsList, checkedItems
        ) { dialogInterface, position, isChecked ->
            if (isChecked) {
                selectedItems.add(position)
            } else {
                selectedItems.remove(Integer.valueOf(position))
            }
        }

        alertDialogBuilder.setNeutralButton(
            "Clear all"
        ) { dialogInterface, which ->
            for (i in 0 until checkedItems.size) {
                checkedItems[i] = false
                selectedItems.clear()
            }
        }

        alertDialogBuilder.setNegativeButton(
            "Dismiss"
        ) { dialogInterface, i -> dialogInterface.dismiss() }

        alertDialogBuilder.setPositiveButton(
            "OK"
        ) { dialogInterface, which ->
            var item = ""
            for (i in selectedItems.indices) {
                item = item + itemsList[selectedItems[i]]
                if (i != selectedItems.size - 1) {
                    item = "$item, "
                }
            }
        }

        val alertDialog = alertDialogBuilder.create()
        alertDialog.setCancelable(false)
        alertDialog.setCanceledOnTouchOutside(false)
        alertDialog.show()
    }

    public fun multiChoiceAlertDialogTwo(activity: Activity) {
        val colorsArray = arrayOf("Black", "Orange", "Green", "Yellow", "White", "Purple")
        val checkedColorsArray = booleanArrayOf(
            true,  /* Black checked */
            false,  /* Orange */
            false,  /* Green */
            true,  /* Yellow checked */
            false,  /* White */
            false /* Purple */
        )

        /* Convert the color array to list */

        /* Convert the color array to list */
        val colorsList: MutableList<Array<String>> = Arrays.asList(colorsArray)

        val alertDialogBuilder = AlertDialog.Builder(activity)

        alertDialogBuilder.setTitle("Select Item")
        alertDialogBuilder.setMultiChoiceItems(
            colorsArray, checkedColorsArray
        ) { dialogInterface, position, isChecked ->
            checkedColorsArray[position] = isChecked
            val currentItem = colorsList.get(position)
            Toast.makeText(applicationContext, "$currentItem $isChecked", Toast.LENGTH_SHORT).show()
        }

        alertDialogBuilder.setNeutralButton(
            "Clear all"
        ) { dialogInterface, which ->
            for (i in checkedColorsArray.indices) {
                checkedColorsArray[i] = false
            }
        }

        alertDialogBuilder.setNegativeButton(
            "Dismiss"
        ) { dialogInterface, i -> dialogInterface.dismiss() }

        alertDialogBuilder.setPositiveButton(
            "OK"
        ) { dialogInterface, which ->
            println("Your preferred colors..... \n")
            for (i in checkedColorsArray.indices) {
                val checked = checkedColorsArray[i]
                if (checked) {
                    println(
                        """
                            ${colorsList[i]}
                            
                            """.trimIndent()
                    )
                }
            }
        }

        val alertDialog = alertDialogBuilder.create()
        alertDialog.setCancelable(false)
        alertDialog.setCanceledOnTouchOutside(false)
        alertDialog.show()
    }

    public fun dateAlertDialog(activity: Activity) {
        val calendar    = Calendar.getInstance()
        val year        = calendar.get(Calendar.YEAR)
        val month       = calendar.get(Calendar.MONTH)
        val day         = calendar.get(Calendar.DAY_OF_MONTH)

        val datePickerDialog = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                Toast.makeText(this, "$dayOfMonth-${month + 1}-$year", Toast.LENGTH_LONG).show()
            },
            year,
            month,
            day
        )
        datePickerDialog.show()
    }

    public fun timeAlertDialog(activity: Activity) {
        val calendar= Calendar.getInstance()
        val hour    = calendar.get(Calendar.HOUR_OF_DAY)
        val minute  = calendar.get(Calendar.MINUTE)

        val timePickerDialog =
            TimePickerDialog(this, TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                Toast.makeText(this, "$hourOfDay-$minute", Toast.LENGTH_LONG).show()
            }, hour, minute, true)

        timePickerDialog.show()
    }
}