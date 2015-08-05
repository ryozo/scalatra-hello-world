package net.equj65.app

import org.scalatra._
import scalate.ScalateSupport

class ScalatraServlet extends ScalatrahelloworldStack {

  get("/") {
    <html>
      <body>
        <h1>Hello, world!</h1>
        Say <a href="hello-scalate">hello to Scalate</a>.
      </body>
    </html>
  }

}
