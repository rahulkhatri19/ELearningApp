package com.geekforgeek

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.geekforgeek.elearningapp.R
import com.geekforgeek.elearningapp.SecreatKey.RAZORPAY_TEST_KEY
import com.razorpay.Checkout
import com.razorpay.PayloadHelper
import com.razorpay.PaymentResultListener

class PaymentActivity : AppCompatActivity(), PaymentResultListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_payment)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val payButton = findViewById<Button>(R.id.btnPayment)


        Checkout.preload(applicationContext)
        val checkout = Checkout()
        checkout.setKeyID(RAZORPAY_TEST_KEY)
        val payload = PayloadHelper("INR", 100, "123456")
        payload.name = "Geek for Geek"
        checkout.open(this, payload.getJson())


        payButton.setOnClickListener {
            checkout.open(this, payload.getJson())
        }

    }

    override fun onPaymentSuccess(paymentId: String?) {
        Toast.makeText(this, "Payment Success", Toast.LENGTH_SHORT).show()
        finish()
    }

    override fun onPaymentError(errorCode: Int, response: String?) {
        Log.e("Payment Act:", "error: $response")
        Toast.makeText(this, "Payment Fail : $response", Toast.LENGTH_SHORT).show()
    }
}