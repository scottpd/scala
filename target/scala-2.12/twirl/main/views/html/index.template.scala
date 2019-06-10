
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[models.SunInfo,Double,Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(sunInfo: models.SunInfo, temperature: Double, requests: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""<!DOCTYPE html >
<html lang="en">
    <head>
        <title>Home</title>
        <link rel="shortcut icon" type="image/png"
              href=""""),_display_(/*7.22*/routes/*7.28*/.Application.versioned("images/favicon.png")),format.raw/*7.72*/("""">
    </head>
    <body>
        <h1>Hello Play</h1>
        <div>Sunrise time: """),_display_(/*11.29*/sunInfo/*11.36*/.sunrise),format.raw/*11.44*/("""</div>
        <div>Sunset time: """),_display_(/*12.28*/sunInfo/*12.35*/.sunset),format.raw/*12.42*/("""</div>
        <div>Current temperature: """),_display_(/*13.36*/temperature),format.raw/*13.47*/("""</div>
        <div>Requests: """),_display_(/*14.25*/requests),format.raw/*14.33*/("""</div>
    </body>
</html>
"""))
      }
    }
  }

  def render(sunInfo:models.SunInfo,temperature:Double,requests:Int): play.twirl.api.HtmlFormat.Appendable = apply(sunInfo,temperature,requests)

  def f:((models.SunInfo,Double,Int) => play.twirl.api.HtmlFormat.Appendable) = (sunInfo,temperature,requests) => apply(sunInfo,temperature,requests)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Jun 10 14:30:24 SAST 2019
                  SOURCE: /Users/scottp1/dev/scala/app/views/index.scala.html
                  HASH: c1bb951ba0ac9386a298c9f147f6c019d4bb2ba2
                  MATRIX: 748->1|903->63|1074->208|1088->214|1152->258|1261->340|1277->347|1306->355|1367->389|1383->396|1411->403|1480->445|1512->456|1570->487|1599->495
                  LINES: 21->1|26->2|31->7|31->7|31->7|35->11|35->11|35->11|36->12|36->12|36->12|37->13|37->13|38->14|38->14
                  -- GENERATED --
              */
          