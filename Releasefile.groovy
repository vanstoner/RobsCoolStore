// Exported from:        http://Robs-MacBook-Pro.local:5516/#/templates/Foldere98fe4726d2140c1b6985f012e6a25c3-Folderbcf94ace88aa4bf48d481b46b56d1d54-Release29638d35cf624b37af5fbd177531bc8e/releasefile
// XL Release version:   8.5.2
// Date created:         Fri Mar 01 15:44:28 GMT 2019

xlr {
  template('Deploy') {
    folder('BT/technical')
    phases {
      phase('Deploy') {
        color '#0099CC'
        tasks {
          script('Deploy') {
            script (['''\
import time
time.sleep(45)
'''])
          }
        }
      }
    }
    
  }
}
