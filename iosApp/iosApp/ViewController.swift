//
//  ViewController.swift
//  iosApp
//
//  Created by Kevin Galligan on 7/29/19.
//  Copyright © 2019 Kevin Galligan. All rights reserved.
//

import UIKit
import app

class ViewController: UIViewController {

    @IBOutlet weak var label: UILabel!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
        label.text = Greeting().hello()
    }
}
